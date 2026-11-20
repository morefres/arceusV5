package ek;

import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryBackend;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryStandardizedField;
import java.util.Set;
import nb.qe;
import qm.c;

/* loaded from: classes2.dex */
public class d {
    public static void a(String str) {
        Set a10;
        a10 = qe.a(new Object[]{TelemetryBackend.EVENT_INGEST, TelemetryBackend.POINTS});
        qm.c.h(new c.a("JavaAssetReadEvent", a10).j(2025, 10, 23).i("New JavaAssetReadEvent").k(rh.h.a().Z()).d(), new c.b().b("assetPathRaw", str).h(TelemetryStandardizedField.ADD_OS_INFO).l());
    }
}
