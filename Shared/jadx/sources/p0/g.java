package p0;

import android.location.Location;
import g0.r1;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    public static final String f28199c = "g";

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal<SimpleDateFormat> f28200d = new a();

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadLocal<SimpleDateFormat> f28201e = new b();

    /* renamed from: f, reason: collision with root package name */
    public static final ThreadLocal<SimpleDateFormat> f28202f = new c();

    /* renamed from: g, reason: collision with root package name */
    public static final List<String> f28203g = n();

    /* renamed from: h, reason: collision with root package name */
    public static final List<String> f28204h = Arrays.asList("ImageWidth", "ImageLength", "PixelXDimension", "PixelYDimension", "Compression", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation");

    /* renamed from: a, reason: collision with root package name */
    public final c4.a f28205a;
    public boolean b = false;

    public class a extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd", Locale.US);
        }
    }

    public class b extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("HH:mm:ss", Locale.US);
        }
    }

    public class c extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        }
    }

    public static final class d {

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public final double f28206a;

            public a(double d10) {
                this.f28206a = d10;
            }

            public double a() {
                return this.f28206a / 2.23694d;
            }
        }

        public static a a(double d10) {
            return new a(d10 * 0.621371d);
        }

        public static a b(double d10) {
            return new a(d10 * 1.15078d);
        }

        public static a c(double d10) {
            return new a(d10);
        }
    }

    public g(c4.a aVar) {
        this.f28205a = aVar;
    }

    public static Date c(String str) {
        return f28200d.get().parse(str);
    }

    public static Date d(String str) {
        return f28202f.get().parse(str);
    }

    public static Date e(String str) {
        return f28201e.get().parse(str);
    }

    public static String f(long j10) {
        return f28202f.get().format(new Date(j10));
    }

    public static g h(File file) {
        return i(file.toString());
    }

    public static g i(String str) {
        return new g(new c4.a(str));
    }

    public static g j(androidx.camera.core.d dVar) {
        ByteBuffer k10 = dVar.F1()[0].k();
        k10.rewind();
        byte[] bArr = new byte[k10.capacity()];
        k10.get(bArr);
        return k(new ByteArrayInputStream(bArr));
    }

    public static g k(InputStream inputStream) {
        return new g(new c4.a(inputStream));
    }

    public static List<String> n() {
        return Arrays.asList("ImageWidth", "ImageLength", "BitsPerSample", "Compression", "PhotometricInterpretation", "Orientation", "SamplesPerPixel", "PlanarConfiguration", "YCbCrSubSampling", "YCbCrPositioning", "XResolution", "YResolution", "ResolutionUnit", "StripOffsets", "RowsPerStrip", "StripByteCounts", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "TransferFunction", "WhitePoint", "PrimaryChromaticities", "YCbCrCoefficients", "ReferenceBlackWhite", "DateTime", "ImageDescription", "Make", "Model", "Software", "Artist", "Copyright", "ExifVersion", "FlashpixVersion", "ColorSpace", "Gamma", "PixelXDimension", "PixelYDimension", "ComponentsConfiguration", "CompressedBitsPerPixel", "MakerNote", "UserComment", "RelatedSoundFile", "DateTimeOriginal", "DateTimeDigitized", "OffsetTime", "OffsetTimeOriginal", "OffsetTimeDigitized", "SubSecTime", "SubSecTimeOriginal", "SubSecTimeDigitized", "ExposureTime", "FNumber", "ExposureProgram", "SpectralSensitivity", "PhotographicSensitivity", "OECF", "SensitivityType", "StandardOutputSensitivity", "RecommendedExposureIndex", "ISOSpeed", "ISOSpeedLatitudeyyy", "ISOSpeedLatitudezzz", "ShutterSpeedValue", "ApertureValue", "BrightnessValue", "ExposureBiasValue", "MaxApertureValue", "SubjectDistance", "MeteringMode", "LightSource", "Flash", "SubjectArea", "FocalLength", "FlashEnergy", "SpatialFrequencyResponse", "FocalPlaneXResolution", "FocalPlaneYResolution", "FocalPlaneResolutionUnit", "SubjectLocation", "ExposureIndex", "SensingMethod", "FileSource", "SceneType", "CFAPattern", "CustomRendered", "ExposureMode", "WhiteBalance", "DigitalZoomRatio", "FocalLengthIn35mmFilm", "SceneCaptureType", "GainControl", "Contrast", "Saturation", "Sharpness", "DeviceSettingDescription", "SubjectDistanceRange", "ImageUniqueID", "CameraOwnerName", "BodySerialNumber", "LensSpecification", "LensMake", "LensModel", "LensSerialNumber", "GPSVersionID", "GPSLatitudeRef", "GPSLatitude", "GPSLongitudeRef", "GPSLongitude", "GPSAltitudeRef", "GPSAltitude", "GPSTimeStamp", "GPSSatellites", "GPSStatus", "GPSMeasureMode", "GPSDOP", "GPSSpeedRef", "GPSSpeed", "GPSTrackRef", "GPSTrack", "GPSImgDirectionRef", "GPSImgDirection", "GPSMapDatum", "GPSDestLatitudeRef", "GPSDestLatitude", "GPSDestLongitudeRef", "GPSDestLongitude", "GPSDestBearingRef", "GPSDestBearing", "GPSDestDistanceRef", "GPSDestDistance", "GPSProcessingMethod", "GPSAreaInformation", "GPSDateStamp", "GPSDifferential", "GPSHPositioningError", "InteroperabilityIndex", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation", "DNGVersion", "DefaultCropSize", "ThumbnailImage", "PreviewImageStart", "PreviewImageLength", "AspectFrame", "SensorBottomBorder", "SensorLeftBorder", "SensorRightBorder", "SensorTopBorder", "ISO", "JpgFromRaw", "Xmp", "NewSubfileType", "SubfileType");
    }

    public void A() {
        if (!this.b) {
            a();
        }
        this.f28205a.c0();
    }

    public final void a() {
        long currentTimeMillis = System.currentTimeMillis();
        String f10 = f(currentTimeMillis);
        this.f28205a.h0("DateTime", f10);
        try {
            this.f28205a.h0("SubSecTime", Long.toString(currentTimeMillis - d(f10).getTime()));
        } catch (ParseException unused) {
        }
    }

    public void b(Location location) {
        this.f28205a.i0(location);
    }

    public void g(g gVar) {
        ArrayList arrayList = new ArrayList(f28203g);
        arrayList.removeAll(f28204h);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            String str = (String) obj;
            String k10 = this.f28205a.k(str);
            String k11 = gVar.f28205a.k(str);
            if (k10 != null && !k10.equals(k11)) {
                gVar.f28205a.h0(str, k10);
            }
        }
    }

    public void l() {
        int i10;
        switch (r()) {
            case 2:
                i10 = 1;
                break;
            case 3:
                i10 = 4;
                break;
            case 4:
                i10 = 3;
                break;
            case 5:
                i10 = 6;
                break;
            case 6:
                i10 = 5;
                break;
            case 7:
                i10 = 8;
                break;
            case 8:
                i10 = 7;
                break;
            default:
                i10 = 2;
                break;
        }
        this.f28205a.h0("Orientation", String.valueOf(i10));
    }

    public void m() {
        int i10;
        switch (r()) {
            case 2:
                i10 = 3;
                break;
            case 3:
                i10 = 2;
                break;
            case 4:
                i10 = 1;
                break;
            case 5:
                i10 = 8;
                break;
            case 6:
                i10 = 7;
                break;
            case 7:
                i10 = 6;
                break;
            case 8:
                i10 = 5;
                break;
            default:
                i10 = 4;
                break;
        }
        this.f28205a.h0("Orientation", String.valueOf(i10));
    }

    public String o() {
        return this.f28205a.k("ImageDescription");
    }

    public int p() {
        return this.f28205a.m("ImageLength", 0);
    }

    public Location q() {
        double a10;
        String k10 = this.f28205a.k("GPSProcessingMethod");
        double[] q10 = this.f28205a.q();
        double j10 = this.f28205a.j(0.0d);
        double l10 = this.f28205a.l("GPSSpeed", 0.0d);
        String k11 = this.f28205a.k("GPSSpeedRef");
        if (k11 == null) {
            k11 = "K";
        }
        long y10 = y(this.f28205a.k("GPSDateStamp"), this.f28205a.k("GPSTimeStamp"));
        if (q10 == null) {
            return null;
        }
        if (k10 == null) {
            k10 = f28199c;
        }
        Location location = new Location(k10);
        location.setLatitude(q10[0]);
        location.setLongitude(q10[1]);
        if (j10 != 0.0d) {
            location.setAltitude(j10);
        }
        if (l10 != 0.0d) {
            int hashCode = k11.hashCode();
            if (hashCode == 75) {
                k11.equals("K");
            } else if (hashCode != 77) {
                if (hashCode == 78 && k11.equals("N")) {
                    a10 = d.b(l10).a();
                    location.setSpeed((float) a10);
                }
            } else if (k11.equals("M")) {
                a10 = d.c(l10).a();
                location.setSpeed((float) a10);
            }
            a10 = d.a(l10).a();
            location.setSpeed((float) a10);
        }
        if (y10 != -1) {
            location.setTime(y10);
        }
        return location;
    }

    public int r() {
        return this.f28205a.m("Orientation", 0);
    }

    public int s() {
        switch (r()) {
            case 3:
            case 4:
                return 180;
            case 5:
                return 270;
            case 6:
            case 7:
                return 90;
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    public long t() {
        long x10 = x(this.f28205a.k("DateTimeOriginal"));
        if (x10 == -1) {
            return -1L;
        }
        String k10 = this.f28205a.k("SubSecTimeOriginal");
        if (k10 == null) {
            return x10;
        }
        try {
            long parseLong = Long.parseLong(k10);
            while (parseLong > 1000) {
                parseLong /= 10;
            }
            return x10 + parseLong;
        } catch (NumberFormatException unused) {
            return x10;
        }
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", Integer.valueOf(u()), Integer.valueOf(p()), Integer.valueOf(s()), Boolean.valueOf(w()), Boolean.valueOf(v()), q(), Long.valueOf(t()), o());
    }

    public int u() {
        return this.f28205a.m("ImageWidth", 0);
    }

    public boolean v() {
        return r() == 2;
    }

    public boolean w() {
        int r8 = r();
        return r8 == 4 || r8 == 5 || r8 == 7;
    }

    public final long x(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return d(str).getTime();
        } catch (ParseException unused) {
            return -1L;
        }
    }

    public final long y(String str, String str2) {
        if (str == null && str2 == null) {
            return -1L;
        }
        if (str2 == null) {
            try {
                return c(str).getTime();
            } catch (ParseException unused) {
                return -1L;
            }
        }
        if (str == null) {
            try {
                return e(str2).getTime();
            } catch (ParseException unused2) {
                return -1L;
            }
        }
        return x(str + " " + str2);
    }

    public void z(int i10) {
        if (i10 % 90 != 0) {
            r1.l(f28199c, String.format(Locale.US, "Can only rotate in right angles (eg. 0, 90, 180, 270). %d is unsupported.", Integer.valueOf(i10)));
            this.f28205a.h0("Orientation", String.valueOf(0));
            return;
        }
        int i11 = i10 % 360;
        int r8 = r();
        while (i11 < 0) {
            i11 += 90;
            switch (r8) {
                case 2:
                    r8 = 5;
                    break;
                case 3:
                case 8:
                    r8 = 6;
                    break;
                case 4:
                    r8 = 7;
                    break;
                case 5:
                    r8 = 4;
                    break;
                case 6:
                    r8 = 1;
                    break;
                case 7:
                    r8 = 2;
                    break;
                default:
                    r8 = 8;
                    break;
            }
        }
        while (i11 > 0) {
            i11 -= 90;
            switch (r8) {
                case 2:
                    r8 = 7;
                    break;
                case 3:
                    r8 = 8;
                    break;
                case 4:
                    r8 = 5;
                    break;
                case 5:
                    r8 = 2;
                    break;
                case 6:
                    r8 = 3;
                    break;
                case 7:
                    r8 = 4;
                    break;
                case 8:
                    r8 = 1;
                    break;
                default:
                    r8 = 6;
                    break;
            }
        }
        this.f28205a.h0("Orientation", String.valueOf(r8));
    }
}
