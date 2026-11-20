package backtraceio.library.http;

import backtraceio.library.logger.BacktraceLogger;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* loaded from: classes.dex */
public class HttpHelper {
    private static final String LOG_TAG = "HttpHelper";

    public static String getResponseMessage(HttpURLConnection httpURLConnection) {
        BacktraceLogger.d(LOG_TAG, "Reading response from HTTP request");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getResponseCode() < 400 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream()));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                bufferedReader.close();
                return sb2.toString();
            }
            sb2.append(readLine);
        }
    }
}
