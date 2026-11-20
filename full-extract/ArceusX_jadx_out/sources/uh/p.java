package uh;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import com.roblox.engine.jni.model.DeviceParams;
import com.roblox.engine.jni.model.DeviceStaticParams;
import com.roblox.engine.jni.model.PlatformParams;
import java.util.Locale;
import rg.e2;
import uh.f;

/* loaded from: classes2.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public Context f32941a;

    public p(Context context) {
        this.f32941a = context;
    }

    public static f.d a(Context context) {
        return b(context, null);
    }

    public static f.d b(Context context, Activity activity) {
        p pVar = new p(context);
        ok.a aVar = new ok.a(pVar.f());
        aVar.isLuaHomePageEnabled = true;
        aVar.isLuaGamesPageEnabled = true;
        aVar.isLuaChatEnabled = true;
        aVar.isTablet = rg.a1.r0();
        DeviceParams d10 = pVar.d();
        f.d dVar = new f.d();
        dVar.b = aVar;
        dVar.f32863c = d10;
        dVar.f32864d = "rbxasset://places/Mobile.rbxl";
        dVar.f32865e = "LuaAppStarterScript";
        dVar.f32866f = dk.c.c().j();
        dVar.f32867g = dk.c.c().n();
        dVar.f32868h = dk.c.c().k();
        dVar.f32869i = dk.c.c().d();
        dVar.f32870j = dk.c.c().i();
        dVar.f32862a = activity;
        return dVar;
    }

    public static DeviceParams c(Context context) {
        return new p(context).d();
    }

    public static DeviceStaticParams e() {
        String str;
        String str2;
        DeviceStaticParams deviceStaticParams = new DeviceStaticParams();
        int i10 = Build.VERSION.SDK_INT;
        deviceStaticParams.osVersion = Integer.toString(i10);
        deviceStaticParams.deviceName = rg.v.b();
        deviceStaticParams.appVersion = rg.a1.e1();
        deviceStaticParams.manufacturer = Build.MANUFACTURER;
        if (i10 >= 31) {
            str = Build.SKU;
            deviceStaticParams.deviceSku = str;
            str2 = Build.SOC_MODEL;
            deviceStaticParams.socModel = str2;
        }
        deviceStaticParams.appBuildVariant = ek.h.a();
        deviceStaticParams.cpu64Bit = Build.SUPPORTED_64_BIT_ABIS.length > 0;
        return deviceStaticParams;
    }

    public DeviceParams d() {
        String str;
        String str2;
        DeviceParams deviceParams = new DeviceParams();
        int i10 = Build.VERSION.SDK_INT;
        deviceParams.osVersion = Integer.toString(i10);
        deviceParams.deviceName = rg.v.b();
        deviceParams.appVersion = rg.a1.e1();
        Locale e10 = oi.b.f().e();
        deviceParams.country = e10 != null ? e10.getCountry() : "";
        deviceParams.manufacturer = Build.MANUFACTURER;
        deviceParams.deviceTotalMemoryMB = cl.a.c(this.f32941a);
        Point j10 = cl.a.j(this.f32941a);
        deviceParams.displayResolution = j10.x + "x" + j10.y;
        Point h10 = cl.a.h(this.f32941a);
        deviceParams.displayPhysicalWidthPixels = h10.x;
        deviceParams.displayPhysicalHeightPixels = h10.y;
        deviceParams.networkType = e2.g(this.f32941a);
        e2.b(this.f32941a, deviceParams);
        e2.c(this.f32941a, deviceParams);
        deviceParams.isChrome = rg.a1.k0();
        deviceParams.appBuildVariant = ek.h.a();
        deviceParams.cpu64Bit = Build.SUPPORTED_64_BIT_ABIS.length > 0;
        if (i10 >= 31) {
            str = Build.SKU;
            deviceParams.deviceSku = str;
            str2 = Build.SOC_MODEL;
            deviceParams.socModel = str2;
        }
        if (rh.h.a().Y1()) {
            deviceParams.testDeviceName = rg.v.c(this.f32941a);
        }
        return deviceParams;
    }

    public PlatformParams f() {
        String r8 = kk.c.p().r();
        ek.q.b("DataModelParamsCreator", "getPlatformParams: assetFolderPath = " + r8);
        PlatformParams platformParams = new PlatformParams();
        platformParams.assetFolderPath = r8;
        platformParams.isTouchDevice = this.f32941a.getPackageManager().hasSystemFeature("android.hardware.touchscreen");
        platformParams.isMouseDevice = this.f32941a.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        platformParams.isKeyboardDevice = this.f32941a.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        platformParams.dpiScale = cl.a.e(this.f32941a);
        Point i10 = cl.a.i(this.f32941a);
        platformParams.viewportWidthMm = i10.x;
        platformParams.viewportHeightMm = i10.y;
        return platformParams;
    }
}
