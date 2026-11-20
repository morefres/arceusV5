package backtraceio.library.services;

import backtraceio.library.common.BacktraceSerializeHelper;
import backtraceio.library.common.BacktraceStringHelper;
import backtraceio.library.common.MultiFormRequestHelper;
import backtraceio.library.common.RequestHelper;
import backtraceio.library.events.OnServerErrorEventListener;
import backtraceio.library.http.HttpHelper;
import backtraceio.library.logger.BacktraceLogger;
import backtraceio.library.models.BacktraceApiResult;
import backtraceio.library.models.BacktraceResult;
import backtraceio.library.models.json.BacktraceReport;
import backtraceio.library.models.metrics.EventsPayload;
import backtraceio.library.models.metrics.EventsResult;
import backtraceio.library.models.types.BacktraceResultStatus;
import backtraceio.library.models.types.HttpException;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

/* loaded from: classes.dex */
class BacktraceReportSender {
    private static final int CHUNK_SIZE = 131072;
    private static final String LOG_TAG = "BacktraceReportSender";

    public static EventsResult sendEvents(String str, String str2, EventsPayload eventsPayload, OnServerErrorEventListener onServerErrorEventListener) {
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2 = null;
        try {
            try {
                try {
                    httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e10) {
                e = e10;
            }
            try {
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
                httpURLConnection.setRequestProperty("Content-Type", RequestHelper.getContentType());
                String str3 = LOG_TAG;
                BacktraceLogger.d(str3, "HttpURLConnection successfully initialized");
                DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                RequestHelper.addJson(dataOutputStream, str2);
                RequestHelper.addEndOfRequest(dataOutputStream);
                dataOutputStream.flush();
                dataOutputStream.close();
                int responseCode = httpURLConnection.getResponseCode();
                BacktraceLogger.d(str3, "Received response status from Backtrace API for HTTP request is: " + responseCode);
                if (responseCode == 200) {
                    EventsResult eventsResult = new EventsResult(eventsPayload, httpURLConnection.getResponseMessage(), BacktraceResultStatus.Ok, responseCode);
                    httpURLConnection.disconnect();
                    BacktraceLogger.d(str3, "Disconnecting HttpUrlConnection successful");
                    return eventsResult;
                }
                String responseMessage = HttpHelper.getResponseMessage(httpURLConnection);
                if (BacktraceStringHelper.isNullOrEmpty(responseMessage)) {
                    responseMessage = httpURLConnection.getResponseMessage();
                }
                throw new HttpException(Integer.valueOf(responseCode), String.format("%s: %s", Integer.valueOf(responseCode), responseMessage));
            } catch (Exception e11) {
                e = e11;
                httpURLConnection2 = httpURLConnection;
                if (onServerErrorEventListener != null) {
                    BacktraceLogger.d(LOG_TAG, "Custom handler on server error");
                    onServerErrorEventListener.onEvent(e);
                }
                String str4 = LOG_TAG;
                BacktraceLogger.e(str4, "Sending HTTP request failed to Backtrace API", e);
                BacktraceLogger.e(str4, "Failed HTTP request URL " + str);
                EventsResult OnError = EventsResult.OnError(eventsPayload, e, -1);
                if (httpURLConnection2 == null) {
                    return OnError;
                }
                httpURLConnection2.disconnect();
                BacktraceLogger.d(str4, "Disconnecting HttpUrlConnection successful");
                return OnError;
            } catch (Throwable th3) {
                th = th3;
                httpURLConnection2 = httpURLConnection;
                if (httpURLConnection2 != null) {
                    try {
                        httpURLConnection2.disconnect();
                        BacktraceLogger.d(LOG_TAG, "Disconnecting HttpUrlConnection successful");
                    } catch (Exception e12) {
                        BacktraceLogger.e(LOG_TAG, "Disconnecting HttpUrlConnection failed", e12);
                        EventsResult.OnError(eventsPayload, e12, -1);
                    }
                }
                throw th;
            }
        } catch (Exception e13) {
            BacktraceLogger.e(LOG_TAG, "Disconnecting HttpUrlConnection failed", e13);
            return EventsResult.OnError(eventsPayload, e13, -1);
        }
    }

    public static BacktraceResult sendReport(String str, String str2, List<String> list, BacktraceReport backtraceReport, OnServerErrorEventListener onServerErrorEventListener) {
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2 = null;
        try {
            try {
                try {
                    httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                } catch (Exception e10) {
                    e = e10;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setChunkedStreamingMode(131072);
                httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
                httpURLConnection.setRequestProperty("Cache-Control", "no-cache");
                httpURLConnection.setRequestProperty("Content-Type", MultiFormRequestHelper.getContentType());
                String str3 = LOG_TAG;
                BacktraceLogger.d(str3, "HttpURLConnection successfully initialized");
                DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                MultiFormRequestHelper.addJson(dataOutputStream, str2);
                MultiFormRequestHelper.addFiles(dataOutputStream, list);
                MultiFormRequestHelper.addEndOfRequest(dataOutputStream);
                dataOutputStream.flush();
                dataOutputStream.close();
                int responseCode = httpURLConnection.getResponseCode();
                BacktraceLogger.d(str3, "Received response status from Backtrace API for HTTP request is: " + responseCode);
                if (responseCode != 200) {
                    String responseMessage = HttpHelper.getResponseMessage(httpURLConnection);
                    if (BacktraceStringHelper.isNullOrEmpty(responseMessage)) {
                        responseMessage = httpURLConnection.getResponseMessage();
                    }
                    throw new HttpException(Integer.valueOf(responseCode), String.format("%s: %s", Integer.valueOf(responseCode), responseMessage));
                }
                BacktraceResult backtraceResult = new BacktraceResult((BacktraceApiResult) BacktraceSerializeHelper.fromJson(HttpHelper.getResponseMessage(httpURLConnection), BacktraceApiResult.class));
                backtraceResult.setBacktraceReport(backtraceReport);
                httpURLConnection.disconnect();
                BacktraceLogger.d(str3, "Disconnecting HttpUrlConnection successful");
                return backtraceResult;
            } catch (Exception e11) {
                e = e11;
                httpURLConnection2 = httpURLConnection;
                if (onServerErrorEventListener != null) {
                    BacktraceLogger.d(LOG_TAG, "Custom handler on server error");
                    onServerErrorEventListener.onEvent(e);
                }
                String str4 = LOG_TAG;
                BacktraceLogger.e(str4, "Sending HTTP request failed to Backtrace API", e);
                BacktraceResult OnError = BacktraceResult.OnError(backtraceReport, e);
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                    BacktraceLogger.d(str4, "Disconnecting HttpUrlConnection successful");
                }
                return OnError;
            } catch (Throwable th3) {
                th = th3;
                httpURLConnection2 = httpURLConnection;
                if (httpURLConnection2 != null) {
                    try {
                        httpURLConnection2.disconnect();
                        BacktraceLogger.d(LOG_TAG, "Disconnecting HttpUrlConnection successful");
                    } catch (Exception e12) {
                        BacktraceLogger.e(LOG_TAG, "Disconnecting HttpUrlConnection failed", e12);
                        BacktraceResult.OnError(backtraceReport, e12);
                    }
                }
                throw th;
            }
        } catch (Exception e13) {
            BacktraceLogger.e(LOG_TAG, "Disconnecting HttpUrlConnection failed", e13);
            return BacktraceResult.OnError(backtraceReport, e13);
        }
    }
}
