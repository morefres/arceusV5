package backtraceio.library.anr;

import java.util.List;

/* loaded from: classes.dex */
public interface ProcessExitInfoProvider {
    List<ExitInfo> getHistoricalExitInfo(String str, int i10, int i11);

    List<Integer> getSupportedTypesOfExitInfo();
}
