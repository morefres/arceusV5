package backtraceio.library.anr;

import backtraceio.library.watchdog.OnApplicationNotRespondingEvent;

/* loaded from: classes.dex */
public interface BacktraceANRHandler {
    void setOnApplicationNotRespondingEvent(OnApplicationNotRespondingEvent onApplicationNotRespondingEvent);

    void stopMonitoringAnr();
}
