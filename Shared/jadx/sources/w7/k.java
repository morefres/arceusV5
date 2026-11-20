package w7;

import android.graphics.Matrix;
import android.util.Log;
import android.util.Xml;
import androidx.core.internal.view.SupportMenu;
import androidx.core.text.HtmlCompat;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import backtraceio.library.services.BacktraceMetrics;
import com.appsflyer.share.attribution.RequestError;
import com.google.mlkit.common.MlKitException;
import com.roblox.client.pushnotification.v2.model.PayloadNotificationChannel;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.ws.RealWebSocket;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DefaultHandler2;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import w7.b;
import w7.e;
import w7.g;

/* loaded from: classes.dex */
public class k {

    /* renamed from: d, reason: collision with root package name */
    public int f34073d;

    /* renamed from: a, reason: collision with root package name */
    public w7.g f34071a = null;
    public g.j0 b = null;

    /* renamed from: c, reason: collision with root package name */
    public boolean f34072c = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f34074e = false;

    /* renamed from: f, reason: collision with root package name */
    public h f34075f = null;

    /* renamed from: g, reason: collision with root package name */
    public StringBuilder f34076g = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f34077h = false;

    /* renamed from: i, reason: collision with root package name */
    public StringBuilder f34078i = null;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34079a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[g.values().length];
            b = iArr;
            try {
                iArr[g.x.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[g.y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[g.width.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[g.height.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[g.version.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[g.href.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[g.preserveAspectRatio.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[g.d.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[g.pathLength.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                b[g.rx.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                b[g.ry.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                b[g.cx.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                b[g.cy.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                b[g.r.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                b[g.x1.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                b[g.y1.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                b[g.x2.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                b[g.y2.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                b[g.dx.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                b[g.dy.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                b[g.requiredFeatures.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                b[g.requiredExtensions.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                b[g.systemLanguage.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                b[g.requiredFormats.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                b[g.requiredFonts.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                b[g.refX.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                b[g.refY.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                b[g.markerWidth.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                b[g.markerHeight.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                b[g.markerUnits.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                b[g.orient.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                b[g.gradientUnits.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                b[g.gradientTransform.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                b[g.spreadMethod.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                b[g.fx.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                b[g.fy.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                b[g.offset.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                b[g.clipPathUnits.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                b[g.startOffset.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                b[g.patternUnits.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                b[g.patternContentUnits.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                b[g.patternTransform.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                b[g.maskUnits.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                b[g.maskContentUnits.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                b[g.style.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                b[g.CLASS.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                b[g.fill.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                b[g.fill_rule.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                b[g.fill_opacity.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                b[g.stroke.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                b[g.stroke_opacity.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                b[g.stroke_width.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                b[g.stroke_linecap.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                b[g.stroke_linejoin.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                b[g.stroke_miterlimit.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                b[g.stroke_dasharray.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                b[g.stroke_dashoffset.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                b[g.opacity.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                b[g.color.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                b[g.font.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                b[g.font_family.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                b[g.font_size.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                b[g.font_weight.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                b[g.font_style.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                b[g.text_decoration.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                b[g.direction.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                b[g.text_anchor.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                b[g.overflow.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                b[g.marker.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                b[g.marker_start.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                b[g.marker_mid.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                b[g.marker_end.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                b[g.display.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                b[g.visibility.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                b[g.stop_color.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                b[g.stop_opacity.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                b[g.clip.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                b[g.clip_path.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                b[g.clip_rule.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                b[g.mask.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                b[g.solid_color.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                b[g.solid_opacity.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                b[g.viewport_fill.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                b[g.viewport_fill_opacity.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                b[g.vector_effect.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                b[g.image_rendering.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                b[g.viewBox.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                b[g.type.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                b[g.media.ordinal()] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            int[] iArr2 = new int[h.values().length];
            f34079a = iArr2;
            try {
                iArr2[h.svg.ordinal()] = 1;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                f34079a[h.g.ordinal()] = 2;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                f34079a[h.a.ordinal()] = 3;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                f34079a[h.defs.ordinal()] = 4;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                f34079a[h.use.ordinal()] = 5;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                f34079a[h.path.ordinal()] = 6;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                f34079a[h.rect.ordinal()] = 7;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                f34079a[h.circle.ordinal()] = 8;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                f34079a[h.ellipse.ordinal()] = 9;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                f34079a[h.line.ordinal()] = 10;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                f34079a[h.polyline.ordinal()] = 11;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                f34079a[h.polygon.ordinal()] = 12;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                f34079a[h.text.ordinal()] = 13;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                f34079a[h.tspan.ordinal()] = 14;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                f34079a[h.tref.ordinal()] = 15;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                f34079a[h.SWITCH.ordinal()] = 16;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                f34079a[h.symbol.ordinal()] = 17;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                f34079a[h.marker.ordinal()] = 18;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                f34079a[h.linearGradient.ordinal()] = 19;
            } catch (NoSuchFieldError unused108) {
            }
            try {
                f34079a[h.radialGradient.ordinal()] = 20;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                f34079a[h.stop.ordinal()] = 21;
            } catch (NoSuchFieldError unused110) {
            }
            try {
                f34079a[h.title.ordinal()] = 22;
            } catch (NoSuchFieldError unused111) {
            }
            try {
                f34079a[h.desc.ordinal()] = 23;
            } catch (NoSuchFieldError unused112) {
            }
            try {
                f34079a[h.clipPath.ordinal()] = 24;
            } catch (NoSuchFieldError unused113) {
            }
            try {
                f34079a[h.textPath.ordinal()] = 25;
            } catch (NoSuchFieldError unused114) {
            }
            try {
                f34079a[h.pattern.ordinal()] = 26;
            } catch (NoSuchFieldError unused115) {
            }
            try {
                f34079a[h.image.ordinal()] = 27;
            } catch (NoSuchFieldError unused116) {
            }
            try {
                f34079a[h.view.ordinal()] = 28;
            } catch (NoSuchFieldError unused117) {
            }
            try {
                f34079a[h.mask.ordinal()] = 29;
            } catch (NoSuchFieldError unused118) {
            }
            try {
                f34079a[h.style.ordinal()] = 30;
            } catch (NoSuchFieldError unused119) {
            }
            try {
                f34079a[h.solidColor.ordinal()] = 31;
            } catch (NoSuchFieldError unused120) {
            }
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static final Map<String, e.a> f34080a;

        static {
            HashMap hashMap = new HashMap(10);
            f34080a = hashMap;
            hashMap.put(PayloadNotificationChannel.SOUND_NONE, e.a.none);
            hashMap.put("xMinYMin", e.a.xMinYMin);
            hashMap.put("xMidYMin", e.a.xMidYMin);
            hashMap.put("xMaxYMin", e.a.xMaxYMin);
            hashMap.put("xMinYMid", e.a.xMinYMid);
            hashMap.put("xMidYMid", e.a.xMidYMid);
            hashMap.put("xMaxYMid", e.a.xMaxYMid);
            hashMap.put("xMinYMax", e.a.xMinYMax);
            hashMap.put("xMidYMax", e.a.xMidYMax);
            hashMap.put("xMaxYMax", e.a.xMaxYMax);
        }

        public static e.a a(String str) {
            return f34080a.get(str);
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public static final Map<String, Integer> f34081a;

        static {
            HashMap hashMap = new HashMap(47);
            f34081a = hashMap;
            hashMap.put("aliceblue", -984833);
            hashMap.put("antiquewhite", -332841);
            hashMap.put("aqua", -16711681);
            hashMap.put("aquamarine", -8388652);
            hashMap.put("azure", -983041);
            hashMap.put("beige", -657956);
            hashMap.put("bisque", -6972);
            hashMap.put("black", Integer.valueOf(ViewCompat.MEASURED_STATE_MASK));
            hashMap.put("blanchedalmond", -5171);
            hashMap.put("blue", -16776961);
            hashMap.put("blueviolet", -7722014);
            hashMap.put("brown", -5952982);
            hashMap.put("burlywood", -2180985);
            hashMap.put("cadetblue", -10510688);
            hashMap.put("chartreuse", -8388864);
            hashMap.put("chocolate", -2987746);
            hashMap.put("coral", -32944);
            hashMap.put("cornflowerblue", -10185235);
            hashMap.put("cornsilk", -1828);
            hashMap.put("crimson", -2354116);
            hashMap.put("cyan", -16711681);
            hashMap.put("darkblue", -16777077);
            hashMap.put("darkcyan", -16741493);
            hashMap.put("darkgoldenrod", -4684277);
            hashMap.put("darkgray", -5658199);
            hashMap.put("darkgreen", -16751616);
            hashMap.put("darkgrey", -5658199);
            hashMap.put("darkkhaki", -4343957);
            hashMap.put("darkmagenta", -7667573);
            hashMap.put("darkolivegreen", -11179217);
            hashMap.put("darkorange", -29696);
            hashMap.put("darkorchid", -6737204);
            hashMap.put("darkred", -7667712);
            hashMap.put("darksalmon", -1468806);
            hashMap.put("darkseagreen", -7357297);
            hashMap.put("darkslateblue", -12042869);
            hashMap.put("darkslategray", -13676721);
            hashMap.put("darkslategrey", -13676721);
            hashMap.put("darkturquoise", -16724271);
            hashMap.put("darkviolet", -7077677);
            hashMap.put("deeppink", -60269);
            hashMap.put("deepskyblue", -16728065);
            hashMap.put("dimgray", -9868951);
            hashMap.put("dimgrey", -9868951);
            hashMap.put("dodgerblue", -14774017);
            hashMap.put("firebrick", -5103070);
            hashMap.put("floralwhite", -1296);
            hashMap.put("forestgreen", -14513374);
            hashMap.put("fuchsia", -65281);
            hashMap.put("gainsboro", -2302756);
            hashMap.put("ghostwhite", -460545);
            hashMap.put("gold", -10496);
            hashMap.put("goldenrod", -2448096);
            hashMap.put("gray", -8355712);
            hashMap.put("green", -16744448);
            hashMap.put("greenyellow", -5374161);
            hashMap.put("grey", -8355712);
            hashMap.put("honeydew", -983056);
            hashMap.put("hotpink", -38476);
            hashMap.put("indianred", -3318692);
            hashMap.put("indigo", -11861886);
            hashMap.put("ivory", -16);
            hashMap.put("khaki", -989556);
            hashMap.put("lavender", -1644806);
            hashMap.put("lavenderblush", -3851);
            hashMap.put("lawngreen", -8586240);
            hashMap.put("lemonchiffon", -1331);
            hashMap.put("lightblue", -5383962);
            hashMap.put("lightcoral", -1015680);
            hashMap.put("lightcyan", -2031617);
            hashMap.put("lightgoldenrodyellow", -329006);
            hashMap.put("lightgray", -2894893);
            hashMap.put("lightgreen", -7278960);
            hashMap.put("lightgrey", -2894893);
            hashMap.put("lightpink", -18751);
            hashMap.put("lightsalmon", -24454);
            hashMap.put("lightseagreen", -14634326);
            hashMap.put("lightskyblue", -7876870);
            hashMap.put("lightslategray", -8943463);
            hashMap.put("lightslategrey", -8943463);
            hashMap.put("lightsteelblue", -5192482);
            hashMap.put("lightyellow", -32);
            hashMap.put("lime", -16711936);
            hashMap.put("limegreen", -13447886);
            hashMap.put("linen", -331546);
            hashMap.put("magenta", -65281);
            hashMap.put("maroon", -8388608);
            hashMap.put("mediumaquamarine", -10039894);
            hashMap.put("mediumblue", -16777011);
            hashMap.put("mediumorchid", -4565549);
            hashMap.put("mediumpurple", -7114533);
            hashMap.put("mediumseagreen", -12799119);
            hashMap.put("mediumslateblue", -8689426);
            hashMap.put("mediumspringgreen", -16713062);
            hashMap.put("mediumturquoise", -12004916);
            hashMap.put("mediumvioletred", -3730043);
            hashMap.put("midnightblue", -15132304);
            hashMap.put("mintcream", -655366);
            hashMap.put("mistyrose", -6943);
            hashMap.put("moccasin", -6987);
            hashMap.put("navajowhite", -8531);
            hashMap.put("navy", -16777088);
            hashMap.put("oldlace", -133658);
            hashMap.put("olive", -8355840);
            hashMap.put("olivedrab", -9728477);
            hashMap.put("orange", -23296);
            hashMap.put("orangered", -47872);
            hashMap.put("orchid", -2461482);
            hashMap.put("palegoldenrod", -1120086);
            hashMap.put("palegreen", -6751336);
            hashMap.put("paleturquoise", -5247250);
            hashMap.put("palevioletred", -2396013);
            hashMap.put("papayawhip", -4139);
            hashMap.put("peachpuff", -9543);
            hashMap.put("peru", -3308225);
            hashMap.put("pink", -16181);
            hashMap.put("plum", -2252579);
            hashMap.put("powderblue", -5185306);
            hashMap.put("purple", -8388480);
            hashMap.put("rebeccapurple", -10079335);
            hashMap.put("red", Integer.valueOf(SupportMenu.CATEGORY_MASK));
            hashMap.put("rosybrown", -4419697);
            hashMap.put("royalblue", -12490271);
            hashMap.put("saddlebrown", -7650029);
            hashMap.put("salmon", -360334);
            hashMap.put("sandybrown", -744352);
            hashMap.put("seagreen", -13726889);
            hashMap.put("seashell", -2578);
            hashMap.put("sienna", -6270419);
            hashMap.put("silver", -4144960);
            hashMap.put("skyblue", -7876885);
            hashMap.put("slateblue", -9807155);
            hashMap.put("slategray", -9404272);
            hashMap.put("slategrey", -9404272);
            hashMap.put("snow", -1286);
            hashMap.put("springgreen", -16711809);
            hashMap.put("steelblue", -12156236);
            hashMap.put("tan", -2968436);
            hashMap.put("teal", -16744320);
            hashMap.put("thistle", -2572328);
            hashMap.put("tomato", -40121);
            hashMap.put("turquoise", -12525360);
            hashMap.put("violet", -1146130);
            hashMap.put("wheat", -663885);
            hashMap.put("white", -1);
            hashMap.put("whitesmoke", -657931);
            hashMap.put("yellow", Integer.valueOf(InputDeviceCompat.SOURCE_ANY));
            hashMap.put("yellowgreen", -6632142);
            hashMap.put("transparent", 0);
        }

        public static Integer a(String str) {
            return f34081a.get(str);
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public static final Map<String, g.p> f34082a;

        static {
            HashMap hashMap = new HashMap(9);
            f34082a = hashMap;
            g.d1 d1Var = g.d1.pt;
            hashMap.put("xx-small", new g.p(0.694f, d1Var));
            hashMap.put("x-small", new g.p(0.833f, d1Var));
            hashMap.put("small", new g.p(10.0f, d1Var));
            hashMap.put("medium", new g.p(12.0f, d1Var));
            hashMap.put("large", new g.p(14.4f, d1Var));
            hashMap.put("x-large", new g.p(17.3f, d1Var));
            hashMap.put("xx-large", new g.p(20.7f, d1Var));
            g.d1 d1Var2 = g.d1.percent;
            hashMap.put("smaller", new g.p(83.33f, d1Var2));
            hashMap.put("larger", new g.p(120.0f, d1Var2));
        }

        public static g.p a(String str) {
            return f34082a.get(str);
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public static final Map<String, Integer> f34083a;

        static {
            HashMap hashMap = new HashMap(13);
            f34083a = hashMap;
            hashMap.put("normal", 400);
            hashMap.put("bold", 700);
            hashMap.put("bolder", 1);
            hashMap.put("lighter", -1);
            hashMap.put("100", 100);
            hashMap.put("200", Integer.valueOf(MlKitException.CODE_SCANNER_UNAVAILABLE));
            hashMap.put("300", Integer.valueOf(MlKitException.LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE));
            hashMap.put("400", 400);
            hashMap.put("500", 500);
            hashMap.put("600", 600);
            hashMap.put("700", 700);
            hashMap.put("800", 800);
            hashMap.put("900", 900);
        }

        public static Integer a(String str) {
            return f34083a.get(str);
        }
    }

    public class f extends DefaultHandler2 {
        public f() {
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i10, int i11) {
            k.this.c1(new String(cArr, i10, i11));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endDocument() {
            k.this.o();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) {
            k.this.p(str, str2, str3);
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void processingInstruction(String str, String str2) {
            k.this.r(str, k.this.x0(new i(str2)));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startDocument() {
            k.this.W0();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) {
            k.this.X0(str, str2, str3, attributes);
        }

        public /* synthetic */ f(k kVar, a aVar) {
            this();
        }
    }

    public enum g {
        CLASS,
        clip,
        clip_path,
        clipPathUnits,
        clip_rule,
        color,
        cx,
        cy,
        direction,
        dx,
        dy,
        fx,
        fy,
        d,
        display,
        fill,
        fill_rule,
        fill_opacity,
        font,
        font_family,
        font_size,
        font_weight,
        font_style,
        gradientTransform,
        gradientUnits,
        height,
        href,
        image_rendering,
        marker,
        marker_start,
        marker_mid,
        marker_end,
        markerHeight,
        markerUnits,
        markerWidth,
        mask,
        maskContentUnits,
        maskUnits,
        media,
        offset,
        opacity,
        orient,
        overflow,
        pathLength,
        patternContentUnits,
        patternTransform,
        patternUnits,
        points,
        preserveAspectRatio,
        r,
        refX,
        refY,
        requiredFeatures,
        requiredExtensions,
        requiredFormats,
        requiredFonts,
        rx,
        ry,
        solid_color,
        solid_opacity,
        spreadMethod,
        startOffset,
        stop_color,
        stop_opacity,
        stroke,
        stroke_dasharray,
        stroke_dashoffset,
        stroke_linecap,
        stroke_linejoin,
        stroke_miterlimit,
        stroke_opacity,
        stroke_width,
        style,
        systemLanguage,
        text_anchor,
        text_decoration,
        transform,
        type,
        vector_effect,
        version,
        viewBox,
        width,
        x,
        y,
        x1,
        y1,
        x2,
        y2,
        viewport_fill,
        viewport_fill_opacity,
        visibility,
        UNSUPPORTED;

        public static final Map<String, g> O0 = new HashMap();

        static {
            for (g gVar : values()) {
                if (gVar == CLASS) {
                    O0.put("class", gVar);
                } else if (gVar != UNSUPPORTED) {
                    O0.put(gVar.name().replace('_', '-'), gVar);
                }
            }
        }

        public static g a(String str) {
            g gVar = O0.get(str);
            return gVar != null ? gVar : UNSUPPORTED;
        }
    }

    public enum h {
        svg,
        a,
        circle,
        clipPath,
        defs,
        desc,
        ellipse,
        g,
        image,
        line,
        linearGradient,
        marker,
        mask,
        path,
        pattern,
        polygon,
        polyline,
        radialGradient,
        rect,
        solidColor,
        stop,
        style,
        SWITCH,
        symbol,
        text,
        textPath,
        title,
        tref,
        tspan,
        use,
        view,
        UNSUPPORTED;

        public static final Map<String, h> G = new HashMap();

        static {
            for (h hVar : values()) {
                if (hVar == SWITCH) {
                    G.put("switch", hVar);
                } else if (hVar != UNSUPPORTED) {
                    G.put(hVar.name(), hVar);
                }
            }
        }

        public static h a(String str) {
            h hVar = G.get(str);
            return hVar != null ? hVar : UNSUPPORTED;
        }
    }

    public static class i {

        /* renamed from: a, reason: collision with root package name */
        public String f34161a;

        /* renamed from: c, reason: collision with root package name */
        public int f34162c;
        public int b = 0;

        /* renamed from: d, reason: collision with root package name */
        public w7.d f34163d = new w7.d();

        public i(String str) {
            this.f34162c = 0;
            String trim = str.trim();
            this.f34161a = trim;
            this.f34162c = trim.length();
        }

        public void A() {
            while (true) {
                int i10 = this.b;
                if (i10 >= this.f34162c || !k(this.f34161a.charAt(i10))) {
                    return;
                } else {
                    this.b++;
                }
            }
        }

        public int a() {
            int i10 = this.b;
            int i11 = this.f34162c;
            if (i10 == i11) {
                return -1;
            }
            int i12 = i10 + 1;
            this.b = i12;
            if (i12 < i11) {
                return this.f34161a.charAt(i12);
            }
            return -1;
        }

        public String b() {
            int i10 = this.b;
            while (!h() && !k(this.f34161a.charAt(this.b))) {
                this.b++;
            }
            String substring = this.f34161a.substring(i10, this.b);
            this.b = i10;
            return substring;
        }

        public Boolean c(Object obj) {
            if (obj == null) {
                return null;
            }
            z();
            return m();
        }

        public float d(float f10) {
            if (Float.isNaN(f10)) {
                return Float.NaN;
            }
            z();
            return n();
        }

        public float e(Boolean bool) {
            if (bool == null) {
                return Float.NaN;
            }
            z();
            return n();
        }

        public boolean f(char c10) {
            int i10 = this.b;
            boolean z10 = i10 < this.f34162c && this.f34161a.charAt(i10) == c10;
            if (z10) {
                this.b++;
            }
            return z10;
        }

        public boolean g(String str) {
            int length = str.length();
            int i10 = this.b;
            boolean z10 = i10 <= this.f34162c - length && this.f34161a.substring(i10, i10 + length).equals(str);
            if (z10) {
                this.b += length;
            }
            return z10;
        }

        public boolean h() {
            return this.b == this.f34162c;
        }

        public boolean i() {
            int i10 = this.b;
            if (i10 == this.f34162c) {
                return false;
            }
            char charAt = this.f34161a.charAt(i10);
            if (charAt < 'a' || charAt > 'z') {
                return charAt >= 'A' && charAt <= 'Z';
            }
            return true;
        }

        public boolean j(int i10) {
            return i10 == 10 || i10 == 13;
        }

        public boolean k(int i10) {
            return i10 == 32 || i10 == 10 || i10 == 13 || i10 == 9;
        }

        public Integer l() {
            int i10 = this.b;
            if (i10 == this.f34162c) {
                return null;
            }
            String str = this.f34161a;
            this.b = i10 + 1;
            return Integer.valueOf(str.charAt(i10));
        }

        public Boolean m() {
            int i10 = this.b;
            if (i10 == this.f34162c) {
                return null;
            }
            char charAt = this.f34161a.charAt(i10);
            if (charAt != '0' && charAt != '1') {
                return null;
            }
            this.b++;
            return Boolean.valueOf(charAt == '1');
        }

        public float n() {
            float b = this.f34163d.b(this.f34161a, this.b, this.f34162c);
            if (!Float.isNaN(b)) {
                this.b = this.f34163d.a();
            }
            return b;
        }

        public String o() {
            if (h()) {
                return null;
            }
            int i10 = this.b;
            int charAt = this.f34161a.charAt(i10);
            while (true) {
                if ((charAt < 97 || charAt > 122) && (charAt < 65 || charAt > 90)) {
                    break;
                }
                charAt = a();
            }
            int i11 = this.b;
            while (k(charAt)) {
                charAt = a();
            }
            if (charAt == 40) {
                this.b++;
                return this.f34161a.substring(i10, i11);
            }
            this.b = i10;
            return null;
        }

        public g.p p() {
            float n10 = n();
            if (Float.isNaN(n10)) {
                return null;
            }
            g.d1 v5 = v();
            return v5 == null ? new g.p(n10, g.d1.px) : new g.p(n10, v5);
        }

        public String q() {
            if (h()) {
                return null;
            }
            int i10 = this.b;
            char charAt = this.f34161a.charAt(i10);
            if (charAt != '\'' && charAt != '\"') {
                return null;
            }
            int a10 = a();
            while (a10 != -1 && a10 != charAt) {
                a10 = a();
            }
            if (a10 == -1) {
                this.b = i10;
                return null;
            }
            int i11 = this.b;
            this.b = i11 + 1;
            return this.f34161a.substring(i10 + 1, i11);
        }

        public String r() {
            return t(' ', false);
        }

        public String s(char c10) {
            return t(c10, false);
        }

        public String t(char c10, boolean z10) {
            if (h()) {
                return null;
            }
            char charAt = this.f34161a.charAt(this.b);
            if ((!z10 && k(charAt)) || charAt == c10) {
                return null;
            }
            int i10 = this.b;
            int a10 = a();
            while (a10 != -1 && a10 != c10 && (z10 || !k(a10))) {
                a10 = a();
            }
            return this.f34161a.substring(i10, this.b);
        }

        public String u(char c10) {
            return t(c10, true);
        }

        public g.d1 v() {
            if (h()) {
                return null;
            }
            if (this.f34161a.charAt(this.b) == '%') {
                this.b++;
                return g.d1.percent;
            }
            int i10 = this.b;
            if (i10 > this.f34162c - 2) {
                return null;
            }
            try {
                g.d1 valueOf = g.d1.valueOf(this.f34161a.substring(i10, i10 + 2).toLowerCase(Locale.US));
                this.b += 2;
                return valueOf;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public String w() {
            if (h()) {
                return null;
            }
            int i10 = this.b;
            char charAt = this.f34161a.charAt(i10);
            if ((charAt < 'A' || charAt > 'Z') && (charAt < 'a' || charAt > 'z')) {
                this.b = i10;
                return null;
            }
            int a10 = a();
            while (true) {
                if ((a10 < 65 || a10 > 90) && (a10 < 97 || a10 > 122)) {
                    break;
                }
                a10 = a();
            }
            return this.f34161a.substring(i10, this.b);
        }

        public float x() {
            z();
            float b = this.f34163d.b(this.f34161a, this.b, this.f34162c);
            if (!Float.isNaN(b)) {
                this.b = this.f34163d.a();
            }
            return b;
        }

        public String y() {
            if (h()) {
                return null;
            }
            int i10 = this.b;
            this.b = this.f34162c;
            return this.f34161a.substring(i10);
        }

        public boolean z() {
            A();
            int i10 = this.b;
            if (i10 == this.f34162c || this.f34161a.charAt(i10) != ',') {
                return false;
            }
            this.b++;
            A();
            return true;
        }
    }

    public class j implements Attributes {

        /* renamed from: a, reason: collision with root package name */
        public XmlPullParser f34164a;

        public j(XmlPullParser xmlPullParser) {
            this.f34164a = xmlPullParser;
        }

        @Override // org.xml.sax.Attributes
        public int getIndex(String str, String str2) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public int getLength() {
            return this.f34164a.getAttributeCount();
        }

        @Override // org.xml.sax.Attributes
        public String getLocalName(int i10) {
            return this.f34164a.getAttributeName(i10);
        }

        @Override // org.xml.sax.Attributes
        public String getQName(int i10) {
            String attributeName = this.f34164a.getAttributeName(i10);
            if (this.f34164a.getAttributePrefix(i10) == null) {
                return attributeName;
            }
            return this.f34164a.getAttributePrefix(i10) + ':' + attributeName;
        }

        @Override // org.xml.sax.Attributes
        public String getType(int i10) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getURI(int i10) {
            return this.f34164a.getAttributeNamespace(i10);
        }

        @Override // org.xml.sax.Attributes
        public String getValue(int i10) {
            return this.f34164a.getAttributeValue(i10);
        }

        @Override // org.xml.sax.Attributes
        public int getIndex(String str) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public String getType(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getValue(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getType(String str) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getValue(String str) {
            return null;
        }
    }

    public static Set<String> A0(String str) {
        i iVar = new i(str);
        HashSet hashSet = new HashSet();
        while (!iVar.h()) {
            hashSet.add(iVar.r());
            iVar.A();
        }
        return hashSet;
    }

    public static g.p[] B0(String str) {
        g.p p8;
        i iVar = new i(str);
        iVar.A();
        if (iVar.h() || (p8 = iVar.p()) == null || p8.i()) {
            return null;
        }
        float a10 = p8.a();
        ArrayList arrayList = new ArrayList();
        arrayList.add(p8);
        while (!iVar.h()) {
            iVar.z();
            g.p p10 = iVar.p();
            if (p10 == null || p10.i()) {
                return null;
            }
            arrayList.add(p10);
            a10 += p10.a();
        }
        if (a10 == 0.0f) {
            return null;
        }
        return (g.p[]) arrayList.toArray(new g.p[arrayList.size()]);
    }

    public static g.e0.c C0(String str) {
        if ("butt".equals(str)) {
            return g.e0.c.Butt;
        }
        if ("round".equals(str)) {
            return g.e0.c.Round;
        }
        if ("square".equals(str)) {
            return g.e0.c.Square;
        }
        return null;
    }

    public static g.e0.d D0(String str) {
        if ("miter".equals(str)) {
            return g.e0.d.Miter;
        }
        if ("round".equals(str)) {
            return g.e0.d.Round;
        }
        if ("bevel".equals(str)) {
            return g.e0.d.Bevel;
        }
        return null;
    }

    public static void E0(g.l0 l0Var, String str) {
        i iVar = new i(str.replaceAll("/\\*.*?\\*/", ""));
        while (true) {
            String s8 = iVar.s(':');
            iVar.A();
            if (!iVar.f(':')) {
                return;
            }
            iVar.A();
            String u8 = iVar.u(';');
            if (u8 == null) {
                return;
            }
            iVar.A();
            if (iVar.h() || iVar.f(';')) {
                if (l0Var.f33965f == null) {
                    l0Var.f33965f = new g.e0();
                }
                S0(l0Var.f33965f, s8, u8);
                iVar.A();
            }
        }
    }

    public static Set<String> F0(String str) {
        i iVar = new i(str);
        HashSet hashSet = new HashSet();
        while (!iVar.h()) {
            String r8 = iVar.r();
            int indexOf = r8.indexOf(45);
            if (indexOf != -1) {
                r8 = r8.substring(0, indexOf);
            }
            hashSet.add(new Locale(r8, "", "").getLanguage());
            iVar.A();
        }
        return hashSet;
    }

    public static g.e0.f G0(String str) {
        str.getClass();
        switch (str) {
            case "middle":
                return g.e0.f.Middle;
            case "end":
                return g.e0.f.End;
            case "start":
                return g.e0.f.Start;
            default:
                return null;
        }
    }

    public static g.e0.EnumC0633g H0(String str) {
        str.getClass();
        switch (str) {
            case "line-through":
                return g.e0.EnumC0633g.LineThrough;
            case "underline":
                return g.e0.EnumC0633g.Underline;
            case "none":
                return g.e0.EnumC0633g.None;
            case "blink":
                return g.e0.EnumC0633g.Blink;
            case "overline":
                return g.e0.EnumC0633g.Overline;
            default:
                return null;
        }
    }

    public static g.e0.h I0(String str) {
        str.getClass();
        if (str.equals("ltr")) {
            return g.e0.h.LTR;
        }
        if (str.equals("rtl")) {
            return g.e0.h.RTL;
        }
        return null;
    }

    public static g.e0.i M0(String str) {
        str.getClass();
        if (str.equals(PayloadNotificationChannel.SOUND_NONE)) {
            return g.e0.i.None;
        }
        if (str.equals("non-scaling-stroke")) {
            return g.e0.i.NonScalingStroke;
        }
        return null;
    }

    public static g.b N0(String str) {
        i iVar = new i(str);
        iVar.A();
        float n10 = iVar.n();
        iVar.z();
        float n11 = iVar.n();
        iVar.z();
        float n12 = iVar.n();
        iVar.z();
        float n13 = iVar.n();
        if (Float.isNaN(n10) || Float.isNaN(n11) || Float.isNaN(n12) || Float.isNaN(n13)) {
            throw new w7.j("Invalid viewBox definition - should have four numbers");
        }
        if (n12 < 0.0f) {
            throw new w7.j("Invalid viewBox. width cannot be negative");
        }
        if (n13 >= 0.0f) {
            return new g.b(n10, n11, n12, n13);
        }
        throw new w7.j("Invalid viewBox. height cannot be negative");
    }

    public static void S0(g.e0 e0Var, String str, String str2) {
        if (str2.length() == 0 || str2.equals("inherit")) {
            return;
        }
        try {
            switch (a.b[g.a(str).ordinal()]) {
                case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                    g.o0 t02 = t0(str2);
                    e0Var.b = t02;
                    if (t02 != null) {
                        e0Var.f33873a |= 1;
                        break;
                    }
                    break;
                case 48:
                    g.e0.a e02 = e0(str2);
                    e0Var.f33874c = e02;
                    if (e02 != null) {
                        e0Var.f33873a |= 2;
                        break;
                    }
                    break;
                case 49:
                    Float r02 = r0(str2);
                    e0Var.f33875d = r02;
                    if (r02 != null) {
                        e0Var.f33873a |= 4;
                        break;
                    }
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    g.o0 t03 = t0(str2);
                    e0Var.f33876e = t03;
                    if (t03 != null) {
                        e0Var.f33873a |= 8;
                        break;
                    }
                    break;
                case 51:
                    Float r03 = r0(str2);
                    e0Var.f33877f = r03;
                    if (r03 != null) {
                        e0Var.f33873a |= 16;
                        break;
                    }
                    break;
                case 52:
                    e0Var.f33878g = o0(str2);
                    e0Var.f33873a |= 32;
                    break;
                case 53:
                    g.e0.c C0 = C0(str2);
                    e0Var.f33879h = C0;
                    if (C0 != null) {
                        e0Var.f33873a |= 64;
                        break;
                    }
                    break;
                case 54:
                    g.e0.d D0 = D0(str2);
                    e0Var.f33880i = D0;
                    if (D0 != null) {
                        e0Var.f33873a |= 128;
                        break;
                    }
                    break;
                case 55:
                    e0Var.f33881j = Float.valueOf(f0(str2));
                    e0Var.f33873a |= 256;
                    break;
                case 56:
                    if (!PayloadNotificationChannel.SOUND_NONE.equals(str2)) {
                        g.p[] B0 = B0(str2);
                        e0Var.f33882k = B0;
                        if (B0 != null) {
                            e0Var.f33873a |= 512;
                            break;
                        }
                    } else {
                        e0Var.f33882k = null;
                        e0Var.f33873a |= 512;
                        break;
                    }
                    break;
                case 57:
                    e0Var.f33883l = o0(str2);
                    e0Var.f33873a |= RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
                    break;
                case 58:
                    e0Var.f33884m = r0(str2);
                    e0Var.f33873a |= 2048;
                    break;
                case 59:
                    e0Var.f33885n = b0(str2);
                    e0Var.f33873a |= 4096;
                    break;
                case 60:
                    h0(e0Var, str2);
                    break;
                case 61:
                    List<String> i02 = i0(str2);
                    e0Var.f33886o = i02;
                    if (i02 != null) {
                        e0Var.f33873a |= 8192;
                        break;
                    }
                    break;
                case 62:
                    g.p j02 = j0(str2);
                    e0Var.f33887p = j02;
                    if (j02 != null) {
                        e0Var.f33873a |= Http2Stream.EMIT_BUFFER_SIZE;
                        break;
                    }
                    break;
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    Integer l02 = l0(str2);
                    e0Var.f33888q = l02;
                    if (l02 != null) {
                        e0Var.f33873a |= 32768;
                        break;
                    }
                    break;
                case 64:
                    g.e0.b k02 = k0(str2);
                    e0Var.f33889r = k02;
                    if (k02 != null) {
                        e0Var.f33873a |= 65536;
                        break;
                    }
                    break;
                case 65:
                    g.e0.EnumC0633g H0 = H0(str2);
                    e0Var.f33890s = H0;
                    if (H0 != null) {
                        e0Var.f33873a |= 131072;
                        break;
                    }
                    break;
                case 66:
                    g.e0.h I0 = I0(str2);
                    e0Var.f33891t = I0;
                    if (I0 != null) {
                        e0Var.f33873a |= 68719476736L;
                        break;
                    }
                    break;
                case 67:
                    g.e0.f G0 = G0(str2);
                    e0Var.f33892u = G0;
                    if (G0 != null) {
                        e0Var.f33873a |= 262144;
                        break;
                    }
                    break;
                case 68:
                    Boolean s02 = s0(str2);
                    e0Var.f33893v = s02;
                    if (s02 != null) {
                        e0Var.f33873a |= 524288;
                        break;
                    }
                    break;
                case 69:
                    String m02 = m0(str2, str);
                    e0Var.f33895x = m02;
                    e0Var.f33896y = m02;
                    e0Var.f33897z = m02;
                    e0Var.f33873a |= 14680064;
                    break;
                case 70:
                    e0Var.f33895x = m0(str2, str);
                    e0Var.f33873a |= 2097152;
                    break;
                case 71:
                    e0Var.f33896y = m0(str2, str);
                    e0Var.f33873a |= 4194304;
                    break;
                case 72:
                    e0Var.f33897z = m0(str2, str);
                    e0Var.f33873a |= 8388608;
                    break;
                case 73:
                    if (str2.indexOf(124) < 0) {
                        if ("|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".contains('|' + str2 + '|')) {
                            e0Var.A = Boolean.valueOf(!str2.equals(PayloadNotificationChannel.SOUND_NONE));
                            e0Var.f33873a |= 16777216;
                            break;
                        }
                    }
                    break;
                case 74:
                    if (str2.indexOf(124) < 0) {
                        if ("|visible|hidden|collapse|".contains('|' + str2 + '|')) {
                            e0Var.B = Boolean.valueOf(str2.equals("visible"));
                            e0Var.f33873a |= 33554432;
                            break;
                        }
                    }
                    break;
                case 75:
                    if (str2.equals("currentColor")) {
                        e0Var.C = g.C0634g.a();
                    } else {
                        try {
                            e0Var.C = b0(str2);
                        } catch (w7.j e10) {
                            Log.w("SVGParser", e10.getMessage());
                            return;
                        }
                    }
                    e0Var.f33873a |= 67108864;
                    break;
                case 76:
                    e0Var.D = r0(str2);
                    e0Var.f33873a |= 134217728;
                    break;
                case 77:
                    g.c a02 = a0(str2);
                    e0Var.f33894w = a02;
                    if (a02 != null) {
                        e0Var.f33873a |= 1048576;
                        break;
                    }
                    break;
                case 78:
                    e0Var.E = m0(str2, str);
                    e0Var.f33873a |= 268435456;
                    break;
                case 79:
                    e0Var.F = e0(str2);
                    e0Var.f33873a |= 536870912;
                    break;
                case 80:
                    e0Var.G = m0(str2, str);
                    e0Var.f33873a |= 1073741824;
                    break;
                case 81:
                    if (str2.equals("currentColor")) {
                        e0Var.H = g.C0634g.a();
                    } else {
                        try {
                            e0Var.H = b0(str2);
                        } catch (w7.j e11) {
                            Log.w("SVGParser", e11.getMessage());
                            return;
                        }
                    }
                    e0Var.f33873a |= 2147483648L;
                    break;
                case 82:
                    e0Var.I = r0(str2);
                    e0Var.f33873a |= 4294967296L;
                    break;
                case 83:
                    if (str2.equals("currentColor")) {
                        e0Var.J = g.C0634g.a();
                    } else {
                        try {
                            e0Var.J = b0(str2);
                        } catch (w7.j e12) {
                            Log.w("SVGParser", e12.getMessage());
                            return;
                        }
                    }
                    e0Var.f33873a |= 8589934592L;
                    break;
                case 84:
                    e0Var.K = r0(str2);
                    e0Var.f33873a |= 17179869184L;
                    break;
                case 85:
                    g.e0.i M0 = M0(str2);
                    e0Var.L = M0;
                    if (M0 != null) {
                        e0Var.f33873a |= 34359738368L;
                        break;
                    }
                    break;
                case 86:
                    g.e0.e y02 = y0(str2);
                    e0Var.M = y02;
                    if (y02 != null) {
                        e0Var.f33873a |= 137438953472L;
                        break;
                    }
                    break;
            }
        } catch (w7.j unused) {
        }
    }

    public static g.c a0(String str) {
        if ("auto".equals(str) || !str.startsWith("rect(")) {
            return null;
        }
        i iVar = new i(str.substring(5));
        iVar.A();
        g.p q02 = q0(iVar);
        iVar.z();
        g.p q03 = q0(iVar);
        iVar.z();
        g.p q04 = q0(iVar);
        iVar.z();
        g.p q05 = q0(iVar);
        iVar.A();
        if (iVar.f(')') || iVar.h()) {
            return new g.c(q02, q03, q04, q05);
        }
        return null;
    }

    public static g.f b0(String str) {
        if (str.charAt(0) == '#') {
            w7.c b10 = w7.c.b(str, 1, str.length());
            if (b10 == null) {
                throw new w7.j("Bad hex colour value: " + str);
            }
            int a10 = b10.a();
            if (a10 == 4) {
                int d10 = b10.d();
                int i10 = d10 & 3840;
                int i11 = d10 & 240;
                int i12 = d10 & 15;
                return new g.f(i12 | (i10 << 8) | (-16777216) | (i10 << 12) | (i11 << 8) | (i11 << 4) | (i12 << 4));
            }
            if (a10 == 5) {
                int d11 = b10.d();
                int i13 = 61440 & d11;
                int i14 = d11 & 3840;
                int i15 = d11 & 240;
                int i16 = d11 & 15;
                return new g.f((i16 << 24) | (i16 << 28) | (i13 << 8) | (i13 << 4) | (i14 << 4) | i14 | i15 | (i15 >> 4));
            }
            if (a10 == 7) {
                return new g.f(b10.d() | ViewCompat.MEASURED_STATE_MASK);
            }
            if (a10 == 9) {
                return new g.f((b10.d() >>> 8) | (b10.d() << 24));
            }
            throw new w7.j("Bad hex colour value: " + str);
        }
        String lowerCase = str.toLowerCase(Locale.US);
        boolean startsWith = lowerCase.startsWith("rgba(");
        if (!startsWith && !lowerCase.startsWith("rgb(")) {
            boolean startsWith2 = lowerCase.startsWith("hsla(");
            if (!startsWith2 && !lowerCase.startsWith("hsl(")) {
                return c0(lowerCase);
            }
            i iVar = new i(str.substring(startsWith2 ? 5 : 4));
            iVar.A();
            float n10 = iVar.n();
            float d12 = iVar.d(n10);
            if (!Float.isNaN(d12)) {
                iVar.f('%');
            }
            float d13 = iVar.d(d12);
            if (!Float.isNaN(d13)) {
                iVar.f('%');
            }
            if (!startsWith2) {
                iVar.A();
                if (!Float.isNaN(d13) && iVar.f(')')) {
                    return new g.f(s(n10, d12, d13) | ViewCompat.MEASURED_STATE_MASK);
                }
                throw new w7.j("Bad hsl() colour value: " + str);
            }
            float d14 = iVar.d(d13);
            iVar.A();
            if (!Float.isNaN(d14) && iVar.f(')')) {
                return new g.f((j(d14 * 256.0f) << 24) | s(n10, d12, d13));
            }
            throw new w7.j("Bad hsla() colour value: " + str);
        }
        i iVar2 = new i(str.substring(startsWith ? 5 : 4));
        iVar2.A();
        float n11 = iVar2.n();
        if (!Float.isNaN(n11) && iVar2.f('%')) {
            n11 = (n11 * 256.0f) / 100.0f;
        }
        float d15 = iVar2.d(n11);
        if (!Float.isNaN(d15) && iVar2.f('%')) {
            d15 = (d15 * 256.0f) / 100.0f;
        }
        float d16 = iVar2.d(d15);
        if (!Float.isNaN(d16) && iVar2.f('%')) {
            d16 = (d16 * 256.0f) / 100.0f;
        }
        if (!startsWith) {
            iVar2.A();
            if (!Float.isNaN(d16) && iVar2.f(')')) {
                return new g.f((j(n11) << 16) | ViewCompat.MEASURED_STATE_MASK | (j(d15) << 8) | j(d16));
            }
            throw new w7.j("Bad rgb() colour value: " + str);
        }
        float d17 = iVar2.d(d16);
        iVar2.A();
        if (!Float.isNaN(d17) && iVar2.f(')')) {
            return new g.f((j(d17 * 256.0f) << 24) | (j(n11) << 16) | (j(d15) << 8) | j(d16));
        }
        throw new w7.j("Bad rgba() colour value: " + str);
    }

    public static g.f c0(String str) {
        Integer a10 = c.a(str);
        if (a10 != null) {
            return new g.f(a10.intValue());
        }
        throw new w7.j("Invalid colour keyword: " + str);
    }

    public static g.o0 d0(String str) {
        str.getClass();
        if (str.equals(PayloadNotificationChannel.SOUND_NONE)) {
            return g.f.f33929c;
        }
        if (str.equals("currentColor")) {
            return g.C0634g.a();
        }
        try {
            return b0(str);
        } catch (w7.j unused) {
            return null;
        }
    }

    public static g.e0.a e0(String str) {
        if ("nonzero".equals(str)) {
            return g.e0.a.NonZero;
        }
        if ("evenodd".equals(str)) {
            return g.e0.a.EvenOdd;
        }
        return null;
    }

    public static float f0(String str) {
        int length = str.length();
        if (length != 0) {
            return g0(str, 0, length);
        }
        throw new w7.j("Invalid float value (empty string)");
    }

    public static float g0(String str, int i10, int i11) {
        float b10 = new w7.d().b(str, i10, i11);
        if (!Float.isNaN(b10)) {
            return b10;
        }
        throw new w7.j("Invalid float value: " + str);
    }

    public static void h0(g.e0 e0Var, String str) {
        String s8;
        if ("|caption|icon|menu|message-box|small-caption|status-bar|".contains('|' + str + '|')) {
            i iVar = new i(str);
            Integer num = null;
            g.e0.b bVar = null;
            String str2 = null;
            while (true) {
                s8 = iVar.s('/');
                iVar.A();
                if (s8 != null) {
                    if (num != null && bVar != null) {
                        break;
                    }
                    if (!s8.equals("normal") && (num != null || (num = e.a(s8)) == null)) {
                        if (bVar != null || (bVar = k0(s8)) == null) {
                            if (str2 != null || !s8.equals("small-caps")) {
                                break;
                            } else {
                                str2 = s8;
                            }
                        }
                    }
                } else {
                    return;
                }
            }
            g.p j02 = j0(s8);
            if (iVar.f('/')) {
                iVar.A();
                String r8 = iVar.r();
                if (r8 != null) {
                    try {
                        o0(r8);
                    } catch (w7.j unused) {
                        return;
                    }
                }
                iVar.A();
            }
            e0Var.f33886o = i0(iVar.y());
            e0Var.f33887p = j02;
            e0Var.f33888q = Integer.valueOf(num == null ? 400 : num.intValue());
            if (bVar == null) {
                bVar = g.e0.b.Normal;
            }
            e0Var.f33889r = bVar;
            e0Var.f33873a |= 122880;
        }
    }

    public static List<String> i0(String str) {
        i iVar = new i(str);
        ArrayList arrayList = null;
        do {
            String q10 = iVar.q();
            if (q10 == null) {
                q10 = iVar.u(',');
            }
            if (q10 == null) {
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(q10);
            iVar.z();
        } while (!iVar.h());
        return arrayList;
    }

    public static int j(float f10) {
        if (f10 < 0.0f) {
            return 0;
        }
        if (f10 > 255.0f) {
            return 255;
        }
        return Math.round(f10);
    }

    public static g.p j0(String str) {
        try {
            g.p a10 = d.a(str);
            return a10 == null ? o0(str) : a10;
        } catch (w7.j unused) {
            return null;
        }
    }

    public static g.e0.b k0(String str) {
        str.getClass();
        switch (str) {
            case "oblique":
                return g.e0.b.Oblique;
            case "italic":
                return g.e0.b.Italic;
            case "normal":
                return g.e0.b.Normal;
            default:
                return null;
        }
    }

    public static Integer l0(String str) {
        return e.a(str);
    }

    public static String m0(String str, String str2) {
        if (!str.equals(PayloadNotificationChannel.SOUND_NONE) && str.startsWith("url(")) {
            return str.endsWith(")") ? str.substring(4, str.length() - 1).trim() : str.substring(4).trim();
        }
        return null;
    }

    public static g.p o0(String str) {
        if (str.length() == 0) {
            throw new w7.j("Invalid length value (empty string)");
        }
        int length = str.length();
        g.d1 d1Var = g.d1.px;
        char charAt = str.charAt(length - 1);
        if (charAt == '%') {
            length--;
            d1Var = g.d1.percent;
        } else if (length > 2 && Character.isLetter(charAt) && Character.isLetter(str.charAt(length - 2))) {
            length -= 2;
            try {
                d1Var = g.d1.valueOf(str.substring(length).toLowerCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                throw new w7.j("Invalid length unit specifier: " + str);
            }
        }
        try {
            return new g.p(g0(str, 0, length), d1Var);
        } catch (NumberFormatException e10) {
            throw new w7.j("Invalid length value: " + str, e10);
        }
    }

    public static List<g.p> p0(String str) {
        if (str.length() == 0) {
            throw new w7.j("Invalid length list (empty string)");
        }
        ArrayList arrayList = new ArrayList(1);
        i iVar = new i(str);
        iVar.A();
        while (!iVar.h()) {
            float n10 = iVar.n();
            if (Float.isNaN(n10)) {
                throw new w7.j("Invalid length list value: " + iVar.b());
            }
            g.d1 v5 = iVar.v();
            if (v5 == null) {
                v5 = g.d1.px;
            }
            arrayList.add(new g.p(n10, v5));
            iVar.z();
        }
        return arrayList;
    }

    public static g.p q0(i iVar) {
        return iVar.g("auto") ? new g.p(0.0f) : iVar.p();
    }

    public static Float r0(String str) {
        try {
            float f02 = f0(str);
            float f10 = 0.0f;
            if (f02 >= 0.0f) {
                f10 = 1.0f;
                if (f02 > 1.0f) {
                }
                return Float.valueOf(f02);
            }
            f02 = f10;
            return Float.valueOf(f02);
        } catch (w7.j unused) {
            return null;
        }
    }

    public static int s(float f10, float f11, float f12) {
        float f13 = f10 % 360.0f;
        if (f10 < 0.0f) {
            f13 += 360.0f;
        }
        float f14 = f13 / 60.0f;
        float f15 = f11 / 100.0f;
        float f16 = f12 / 100.0f;
        if (f15 < 0.0f) {
            f15 = 0.0f;
        } else if (f15 > 1.0f) {
            f15 = 1.0f;
        }
        float f17 = f16 >= 0.0f ? f16 > 1.0f ? 1.0f : f16 : 0.0f;
        float f18 = f17 <= 0.5f ? (f15 + 1.0f) * f17 : (f17 + f15) - (f15 * f17);
        float f19 = (f17 * 2.0f) - f18;
        return j(t(f19, f18, f14 - 2.0f) * 256.0f) | (j(t(f19, f18, f14 + 2.0f) * 256.0f) << 16) | (j(t(f19, f18, f14) * 256.0f) << 8);
    }

    public static Boolean s0(String str) {
        str.getClass();
        switch (str) {
            case "hidden":
            case "scroll":
                return Boolean.FALSE;
            case "auto":
            case "visible":
                return Boolean.TRUE;
            default:
                return null;
        }
    }

    public static float t(float f10, float f11, float f12) {
        float f13;
        if (f12 < 0.0f) {
            f12 += 6.0f;
        }
        if (f12 >= 6.0f) {
            f12 -= 6.0f;
        }
        if (f12 < 1.0f) {
            f13 = (f11 - f10) * f12;
        } else {
            if (f12 < 3.0f) {
                return f11;
            }
            if (f12 >= 4.0f) {
                return f10;
            }
            f13 = (f11 - f10) * (4.0f - f12);
        }
        return f13 + f10;
    }

    public static g.o0 t0(String str) {
        if (!str.startsWith("url(")) {
            return d0(str);
        }
        int indexOf = str.indexOf(")");
        if (indexOf == -1) {
            return new g.u(str.substring(4).trim(), null);
        }
        String trim = str.substring(4, indexOf).trim();
        String trim2 = str.substring(indexOf + 1).trim();
        return new g.u(trim, trim2.length() > 0 ? d0(trim2) : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0280 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static w7.g.w u0(java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.k.u0(java.lang.String):w7.g$w");
    }

    public static w7.e v0(String str) {
        e.b bVar;
        i iVar = new i(str);
        iVar.A();
        String r8 = iVar.r();
        if ("defer".equals(r8)) {
            iVar.A();
            r8 = iVar.r();
        }
        e.a a10 = b.a(r8);
        iVar.A();
        if (iVar.h()) {
            bVar = null;
        } else {
            String r10 = iVar.r();
            r10.getClass();
            if (r10.equals("meet")) {
                bVar = e.b.meet;
            } else {
                if (!r10.equals("slice")) {
                    throw new w7.j("Invalid preserveAspectRatio definition: " + str);
                }
                bVar = e.b.slice;
            }
        }
        return new w7.e(a10, bVar);
    }

    public static void w0(g.p0 p0Var, String str) {
        p0Var.f33980o = v0(str);
    }

    public static g.e0.e y0(String str) {
        str.getClass();
        switch (str) {
            case "optimizeQuality":
                return g.e0.e.optimizeQuality;
            case "auto":
                return g.e0.e.auto;
            case "optimizeSpeed":
                return g.e0.e.optimizeSpeed;
            default:
                return null;
        }
    }

    public static Set<String> z0(String str) {
        i iVar = new i(str);
        HashSet hashSet = new HashSet();
        while (!iVar.h()) {
            String r8 = iVar.r();
            if (r8.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                hashSet.add(r8.substring(35));
            } else {
                hashSet.add("UNSUPPORTED");
            }
            iVar.A();
        }
        return hashSet;
    }

    public final void A(g.d dVar, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String trim = attributes.getValue(i10).trim();
            switch (a.b[g.a(attributes.getLocalName(i10)).ordinal()]) {
                case 12:
                    dVar.f33859o = o0(trim);
                    break;
                case 13:
                    dVar.f33860p = o0(trim);
                    break;
                case 14:
                    g.p o02 = o0(trim);
                    dVar.f33861q = o02;
                    if (o02.i()) {
                        throw new w7.j("Invalid <circle> element. r cannot be negative");
                    }
                    break;
            }
        }
    }

    public final void B(g.e eVar, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String trim = attributes.getValue(i10).trim();
            if (a.b[g.a(attributes.getLocalName(i10)).ordinal()] == 38) {
                if ("objectBoundingBox".equals(trim)) {
                    eVar.f33872p = Boolean.FALSE;
                } else {
                    if (!"userSpaceOnUse".equals(trim)) {
                        throw new w7.j("Invalid value for attribute clipPathUnits");
                    }
                    eVar.f33872p = Boolean.TRUE;
                }
            }
        }
    }

    public final void C(g.g0 g0Var, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String trim = attributes.getValue(i10).trim();
            switch (a.b[g.a(attributes.getLocalName(i10)).ordinal()]) {
                case MotionEventCompat.AXIS_WHEEL /* 21 */:
                    g0Var.f(z0(trim));
                    break;
                case MotionEventCompat.AXIS_GAS /* 22 */:
                    g0Var.j(trim);
                    break;
                case MotionEventCompat.AXIS_BRAKE /* 23 */:
                    g0Var.h(F0(trim));
                    break;
                case MotionEventCompat.AXIS_DISTANCE /* 24 */:
                    g0Var.i(A0(trim));
                    break;
                case 25:
                    List<String> i02 = i0(trim);
                    g0Var.d(i02 != null ? new HashSet(i02) : new HashSet(0));
                    break;
            }
        }
    }

    public final void D(g.l0 l0Var, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String qName = attributes.getQName(i10);
            if (qName.equals("id") || qName.equals("xml:id")) {
                l0Var.f33962c = attributes.getValue(i10).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String trim = attributes.getValue(i10).trim();
                if ("default".equals(trim)) {
                    l0Var.f33963d = Boolean.FALSE;
                    return;
                } else {
                    if ("preserve".equals(trim)) {
                        l0Var.f33963d = Boolean.TRUE;
                        return;
                    }
                    throw new w7.j("Invalid value for \"xml:space\" attribute: " + trim);
                }
            }
        }
    }

    public final void E(g.i iVar, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String trim = attributes.getValue(i10).trim();
            switch (a.b[g.a(attributes.getLocalName(i10)).ordinal()]) {
                case 10:
                    g.p o02 = o0(trim);
                    iVar.f33945q = o02;
                    if (o02.i()) {
                        throw new w7.j("Invalid <ellipse> element. rx cannot be negative");
                    }
                    break;
                case 11:
                    g.p o03 = o0(trim);
                    iVar.f33946r = o03;
                    if (o03.i()) {
                        throw new w7.j("Invalid <ellipse> element. ry cannot be negative");
                    }
                    break;
                case 12:
                    iVar.f33943o = o0(trim);
                    break;
                case 13:
                    iVar.f33944p = o0(trim);
                    break;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F(w7.g.j r5, org.xml.sax.Attributes r6) {
        /*
            r4 = this;
            r0 = 0
        L1:
            int r1 = r6.getLength()
            if (r0 >= r1) goto L90
            java.lang.String r1 = r6.getValue(r0)
            java.lang.String r1 = r1.trim()
            int[] r2 = w7.k.a.b
            java.lang.String r3 = r6.getLocalName(r0)
            w7.k$g r3 = w7.k.g.a(r3)
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r3 = 6
            if (r2 == r3) goto L72
            switch(r2) {
                case 32: goto L50;
                case 33: goto L49;
                case 34: goto L26;
                default: goto L25;
            }
        L25:
            goto L8c
        L26:
            w7.g$k r2 = w7.g.k.valueOf(r1)     // Catch: java.lang.IllegalArgumentException -> L2d
            r5.f33955k = r2     // Catch: java.lang.IllegalArgumentException -> L2d
            goto L8c
        L2d:
            w7.j r5 = new w7.j
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Invalid spreadMethod attribute. \""
            r6.append(r0)
            r6.append(r1)
            java.lang.String r0 = "\" is not a valid value."
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L49:
            android.graphics.Matrix r1 = r4.J0(r1)
            r5.f33954j = r1
            goto L8c
        L50:
            java.lang.String r2 = "objectBoundingBox"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L5d
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r5.f33953i = r1
            goto L8c
        L5d:
            java.lang.String r2 = "userSpaceOnUse"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L6a
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r5.f33953i = r1
            goto L8c
        L6a:
            w7.j r5 = new w7.j
            java.lang.String r6 = "Invalid value for attribute gradientUnits"
            r5.<init>(r6)
            throw r5
        L72:
            java.lang.String r2 = ""
            java.lang.String r3 = r6.getURI(r0)
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L8a
            java.lang.String r2 = "http://www.w3.org/1999/xlink"
            java.lang.String r3 = r6.getURI(r0)
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L8c
        L8a:
            r5.f33956l = r1
        L8c:
            int r0 = r0 + 1
            goto L1
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.k.F(w7.g$j, org.xml.sax.Attributes):void");
    }

    public final void G(g.o oVar, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String trim = attributes.getValue(i10).trim();
            int i11 = a.b[g.a(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                oVar.f33974q = o0(trim);
            } else if (i11 == 2) {
                oVar.f33975r = o0(trim);
            } else if (i11 == 3) {
                g.p o02 = o0(trim);
                oVar.f33976s = o02;
                if (o02.i()) {
                    throw new w7.j("Invalid <use> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                g.p o03 = o0(trim);
                oVar.f33977t = o03;
                if (o03.i()) {
                    throw new w7.j("Invalid <use> element. height cannot be negative");
                }
            } else if (i11 != 6) {
                if (i11 == 7) {
                    w0(oVar, trim);
                }
            } else if ("".equals(attributes.getURI(i10)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i10))) {
                oVar.f33973p = trim;
            }
        }
    }

    public final void H(g.q qVar, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String trim = attributes.getValue(i10).trim();
            switch (a.b[g.a(attributes.getLocalName(i10)).ordinal()]) {
                case 15:
                    qVar.f33981o = o0(trim);
                    break;
                case 16:
                    qVar.f33982p = o0(trim);
                    break;
                case 17:
                    qVar.f33983q = o0(trim);
                    break;
                case 18:
                    qVar.f33984r = o0(trim);
                    break;
            }
        }
    }

    public final void I(g.m0 m0Var, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String trim = attributes.getValue(i10).trim();
            switch (a.b[g.a(attributes.getLocalName(i10)).ordinal()]) {
                case 15:
                    m0Var.f33968m = o0(trim);
                    break;
                case 16:
                    m0Var.f33969n = o0(trim);
                    break;
                case 17:
                    m0Var.f33970o = o0(trim);
                    break;
                case 18:
                    m0Var.f33971p = o0(trim);
                    break;
            }
        }
    }

    public final void J(g.r rVar, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String trim = attributes.getValue(i10).trim();
            switch (a.b[g.a(attributes.getLocalName(i10)).ordinal()]) {
                case MotionEventCompat.AXIS_SCROLL /* 26 */:
                    rVar.f33991r = o0(trim);
                    break;
                case MotionEventCompat.AXIS_RELATIVE_X /* 27 */:
                    rVar.f33992s = o0(trim);
                    break;
                case MotionEventCompat.AXIS_RELATIVE_Y /* 28 */:
                    g.p o02 = o0(trim);
                    rVar.f33993t = o02;
                    if (o02.i()) {
                        throw new w7.j("Invalid <marker> element. markerWidth cannot be negative");
                    }
                    break;
                case 29:
                    g.p o03 = o0(trim);
                    rVar.f33994u = o03;
                    if (o03.i()) {
                        throw new w7.j("Invalid <marker> element. markerHeight cannot be negative");
                    }
                    break;
                case BacktraceMetrics.defaultTimeIntervalInMin /* 30 */:
                    if (!"strokeWidth".equals(trim)) {
                        if (!"userSpaceOnUse".equals(trim)) {
                            throw new w7.j("Invalid value for attribute markerUnits");
                        }
                        rVar.f33990q = true;
                        break;
                    } else {
                        rVar.f33990q = false;
                        break;
                    }
                case 31:
                    if ("auto".equals(trim)) {
                        rVar.f33995v = Float.valueOf(Float.NaN);
                        break;
                    } else {
                        rVar.f33995v = Float.valueOf(f0(trim));
                        break;
                    }
            }
        }
    }

    public final Matrix J0(String str) {
        Matrix matrix = new Matrix();
        i iVar = new i(str);
        iVar.A();
        while (!iVar.h()) {
            String o8 = iVar.o();
            if (o8 == null) {
                throw new w7.j("Bad transform function encountered in transform list: " + str);
            }
            switch (o8) {
                case "matrix":
                    iVar.A();
                    float n10 = iVar.n();
                    iVar.z();
                    float n11 = iVar.n();
                    iVar.z();
                    float n12 = iVar.n();
                    iVar.z();
                    float n13 = iVar.n();
                    iVar.z();
                    float n14 = iVar.n();
                    iVar.z();
                    float n15 = iVar.n();
                    iVar.A();
                    if (!Float.isNaN(n15) && iVar.f(')')) {
                        Matrix matrix2 = new Matrix();
                        matrix2.setValues(new float[]{n10, n12, n14, n11, n13, n15, 0.0f, 0.0f, 1.0f});
                        matrix.preConcat(matrix2);
                        break;
                    } else {
                        throw new w7.j("Invalid transform list: " + str);
                    }
                    break;
                case "rotate":
                    iVar.A();
                    float n16 = iVar.n();
                    float x10 = iVar.x();
                    float x11 = iVar.x();
                    iVar.A();
                    if (Float.isNaN(n16) || !iVar.f(')')) {
                        throw new w7.j("Invalid transform list: " + str);
                    }
                    if (Float.isNaN(x10)) {
                        matrix.preRotate(n16);
                        break;
                    } else if (!Float.isNaN(x11)) {
                        matrix.preRotate(n16, x10, x11);
                        break;
                    } else {
                        throw new w7.j("Invalid transform list: " + str);
                    }
                case "scale":
                    iVar.A();
                    float n17 = iVar.n();
                    float x12 = iVar.x();
                    iVar.A();
                    if (!Float.isNaN(n17) && iVar.f(')')) {
                        if (!Float.isNaN(x12)) {
                            matrix.preScale(n17, x12);
                            break;
                        } else {
                            matrix.preScale(n17, n17);
                            break;
                        }
                    } else {
                        throw new w7.j("Invalid transform list: " + str);
                    }
                    break;
                case "skewX":
                    iVar.A();
                    float n18 = iVar.n();
                    iVar.A();
                    if (!Float.isNaN(n18) && iVar.f(')')) {
                        matrix.preSkew((float) Math.tan(Math.toRadians(n18)), 0.0f);
                        break;
                    } else {
                        throw new w7.j("Invalid transform list: " + str);
                    }
                    break;
                case "skewY":
                    iVar.A();
                    float n19 = iVar.n();
                    iVar.A();
                    if (!Float.isNaN(n19) && iVar.f(')')) {
                        matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians(n19)));
                        break;
                    } else {
                        throw new w7.j("Invalid transform list: " + str);
                    }
                case "translate":
                    iVar.A();
                    float n20 = iVar.n();
                    float x13 = iVar.x();
                    iVar.A();
                    if (!Float.isNaN(n20) && iVar.f(')')) {
                        if (!Float.isNaN(x13)) {
                            matrix.preTranslate(n20, x13);
                            break;
                        } else {
                            matrix.preTranslate(n20, 0.0f);
                            break;
                        }
                    } else {
                        throw new w7.j("Invalid transform list: " + str);
                    }
                    break;
                default:
                    throw new w7.j("Invalid transform list fn: " + o8 + ")");
            }
            if (iVar.h()) {
                return matrix;
            }
            iVar.z();
        }
        return matrix;
    }

    public final void K(g.s sVar, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String trim = attributes.getValue(i10).trim();
            int i11 = a.b[g.a(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                sVar.f33999q = o0(trim);
            } else if (i11 == 2) {
                sVar.f34000r = o0(trim);
            } else if (i11 == 3) {
                g.p o02 = o0(trim);
                sVar.f34001s = o02;
                if (o02.i()) {
                    throw new w7.j("Invalid <mask> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                g.p o03 = o0(trim);
                sVar.f34002t = o03;
                if (o03.i()) {
                    throw new w7.j("Invalid <mask> element. height cannot be negative");
                }
            } else if (i11 != 43) {
                if (i11 != 44) {
                    continue;
                } else if ("objectBoundingBox".equals(trim)) {
                    sVar.f33998p = Boolean.FALSE;
                } else {
                    if (!"userSpaceOnUse".equals(trim)) {
                        throw new w7.j("Invalid value for attribute maskContentUnits");
                    }
                    sVar.f33998p = Boolean.TRUE;
                }
            } else if ("objectBoundingBox".equals(trim)) {
                sVar.f33997o = Boolean.FALSE;
            } else {
                if (!"userSpaceOnUse".equals(trim)) {
                    throw new w7.j("Invalid value for attribute maskUnits");
                }
                sVar.f33997o = Boolean.TRUE;
            }
        }
    }

    public final void K0(InputStream inputStream) {
        Log.d("SVGParser", "Falling back to SAX parser");
        try {
            SAXParserFactory newInstance = SAXParserFactory.newInstance();
            newInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            newInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = newInstance.newSAXParser().getXMLReader();
            f fVar = new f(this, null);
            xMLReader.setContentHandler(fVar);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", fVar);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e10) {
            throw new w7.j("Stream error", e10);
        } catch (ParserConfigurationException e11) {
            throw new w7.j("XML parser problem", e11);
        } catch (SAXException e12) {
            throw new w7.j("SVG parse error", e12);
        }
    }

    public final void L(g.v vVar, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String trim = attributes.getValue(i10).trim();
            int i11 = a.b[g.a(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 8) {
                vVar.f34006o = u0(trim);
            } else if (i11 != 9) {
                continue;
            } else {
                Float valueOf = Float.valueOf(f0(trim));
                vVar.f34007p = valueOf;
                if (valueOf.floatValue() < 0.0f) {
                    throw new w7.j("Invalid <path> element. pathLength cannot be negative");
                }
            }
        }
    }

    public final void L0(InputStream inputStream, boolean z10) {
        try {
            try {
                XmlPullParser newPullParser = Xml.newPullParser();
                j jVar = new j(newPullParser);
                newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                newPullParser.setInput(inputStream, null);
                for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.nextToken()) {
                    if (eventType == 0) {
                        W0();
                    } else if (eventType == 8) {
                        Log.d("SVGParser", "PROC INSTR: " + newPullParser.getText());
                        i iVar = new i(newPullParser.getText());
                        r(iVar.r(), x0(iVar));
                    } else if (eventType != 10) {
                        if (eventType == 2) {
                            String name = newPullParser.getName();
                            if (newPullParser.getPrefix() != null) {
                                name = newPullParser.getPrefix() + ':' + name;
                            }
                            X0(newPullParser.getNamespace(), newPullParser.getName(), name, jVar);
                        } else if (eventType == 3) {
                            String name2 = newPullParser.getName();
                            if (newPullParser.getPrefix() != null) {
                                name2 = newPullParser.getPrefix() + ':' + name2;
                            }
                            p(newPullParser.getNamespace(), newPullParser.getName(), name2);
                        } else if (eventType == 4) {
                            int[] iArr = new int[2];
                            e1(newPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                        } else if (eventType == 5) {
                            c1(newPullParser.getText());
                        }
                    } else if (z10 && this.f34071a.m() == null && newPullParser.getText().contains("<!ENTITY ")) {
                        try {
                            Log.d("SVGParser", "Switching to SAX parser to process entities");
                            inputStream.reset();
                            K0(inputStream);
                            return;
                        } catch (IOException unused) {
                            Log.w("SVGParser", "Detected internal entity definitions, but could not parse them.");
                            return;
                        }
                    }
                }
                o();
            } catch (IOException e10) {
                throw new w7.j("Stream error", e10);
            }
        } catch (XmlPullParserException e11) {
            throw new w7.j("XML parser problem", e11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cf, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M(w7.g.y r6, org.xml.sax.Attributes r7) {
        /*
            r5 = this;
            r0 = 0
        L1:
            int r1 = r7.getLength()
            if (r0 >= r1) goto Ld3
            java.lang.String r1 = r7.getValue(r0)
            java.lang.String r1 = r1.trim()
            int[] r2 = w7.k.a.b
            java.lang.String r3 = r7.getLocalName(r0)
            w7.k$g r3 = w7.k.g.a(r3)
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r3 = 1
            if (r2 == r3) goto Lc9
            r3 = 2
            if (r2 == r3) goto Lc2
            r3 = 3
            if (r2 == r3) goto Lad
            r3 = 4
            if (r2 == r3) goto L98
            r3 = 6
            if (r2 == r3) goto L7d
            java.lang.String r3 = "userSpaceOnUse"
            java.lang.String r4 = "objectBoundingBox"
            switch(r2) {
                case 40: goto L5f;
                case 41: goto L3f;
                case 42: goto L37;
                default: goto L35;
            }
        L35:
            goto Lcf
        L37:
            android.graphics.Matrix r1 = r5.J0(r1)
            r6.f34015s = r1
            goto Lcf
        L3f:
            boolean r2 = r4.equals(r1)
            if (r2 == 0) goto L4b
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r6.f34014r = r1
            goto Lcf
        L4b:
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L57
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r6.f34014r = r1
            goto Lcf
        L57:
            w7.j r6 = new w7.j
            java.lang.String r7 = "Invalid value for attribute patternContentUnits"
            r6.<init>(r7)
            throw r6
        L5f:
            boolean r2 = r4.equals(r1)
            if (r2 == 0) goto L6a
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r6.f34013q = r1
            goto Lcf
        L6a:
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L75
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r6.f34013q = r1
            goto Lcf
        L75:
            w7.j r6 = new w7.j
            java.lang.String r7 = "Invalid value for attribute patternUnits"
            r6.<init>(r7)
            throw r6
        L7d:
            java.lang.String r2 = ""
            java.lang.String r3 = r7.getURI(r0)
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L95
            java.lang.String r2 = "http://www.w3.org/1999/xlink"
            java.lang.String r3 = r7.getURI(r0)
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto Lcf
        L95:
            r6.f34020x = r1
            goto Lcf
        L98:
            w7.g$p r1 = o0(r1)
            r6.f34019w = r1
            boolean r1 = r1.i()
            if (r1 != 0) goto La5
            goto Lcf
        La5:
            w7.j r6 = new w7.j
            java.lang.String r7 = "Invalid <pattern> element. height cannot be negative"
            r6.<init>(r7)
            throw r6
        Lad:
            w7.g$p r1 = o0(r1)
            r6.f34018v = r1
            boolean r1 = r1.i()
            if (r1 != 0) goto Lba
            goto Lcf
        Lba:
            w7.j r6 = new w7.j
            java.lang.String r7 = "Invalid <pattern> element. width cannot be negative"
            r6.<init>(r7)
            throw r6
        Lc2:
            w7.g$p r1 = o0(r1)
            r6.f34017u = r1
            goto Lcf
        Lc9:
            w7.g$p r1 = o0(r1)
            r6.f34016t = r1
        Lcf:
            int r0 = r0 + 1
            goto L1
        Ld3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.k.M(w7.g$y, org.xml.sax.Attributes):void");
    }

    public final void N(g.z zVar, Attributes attributes, String str) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            if (g.a(attributes.getLocalName(i10)) == g.points) {
                i iVar = new i(attributes.getValue(i10));
                ArrayList arrayList = new ArrayList();
                iVar.A();
                while (!iVar.h()) {
                    float n10 = iVar.n();
                    if (Float.isNaN(n10)) {
                        throw new w7.j("Invalid <" + str + "> points attribute. Non-coordinate content found in list.");
                    }
                    iVar.z();
                    float n11 = iVar.n();
                    if (Float.isNaN(n11)) {
                        throw new w7.j("Invalid <" + str + "> points attribute. There should be an even number of coordinates.");
                    }
                    iVar.z();
                    arrayList.add(Float.valueOf(n10));
                    arrayList.add(Float.valueOf(n11));
                }
                zVar.f34021o = new float[arrayList.size()];
                int size = arrayList.size();
                int i11 = 0;
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    zVar.f34021o[i11] = ((Float) obj).floatValue();
                    i11++;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O(w7.g.q0 r5, org.xml.sax.Attributes r6) {
        /*
            r4 = this;
            r0 = 0
        L1:
            int r1 = r6.getLength()
            if (r0 >= r1) goto L5e
            java.lang.String r1 = r6.getValue(r0)
            java.lang.String r1 = r1.trim()
            int[] r2 = w7.k.a.b
            java.lang.String r3 = r6.getLocalName(r0)
            w7.k$g r3 = w7.k.g.a(r3)
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r3 = 35
            if (r2 == r3) goto L55
            r3 = 36
            if (r2 == r3) goto L4e
            switch(r2) {
                case 12: goto L47;
                case 13: goto L40;
                case 14: goto L2b;
                default: goto L2a;
            }
        L2a:
            goto L5b
        L2b:
            w7.g$p r1 = o0(r1)
            r5.f33987o = r1
            boolean r1 = r1.i()
            if (r1 != 0) goto L38
            goto L5b
        L38:
            w7.j r5 = new w7.j
            java.lang.String r6 = "Invalid <radialGradient> element. r cannot be negative"
            r5.<init>(r6)
            throw r5
        L40:
            w7.g$p r1 = o0(r1)
            r5.f33986n = r1
            goto L5b
        L47:
            w7.g$p r1 = o0(r1)
            r5.f33985m = r1
            goto L5b
        L4e:
            w7.g$p r1 = o0(r1)
            r5.f33989q = r1
            goto L5b
        L55:
            w7.g$p r1 = o0(r1)
            r5.f33988p = r1
        L5b:
            int r0 = r0 + 1
            goto L1
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.k.O(w7.g$q0, org.xml.sax.Attributes):void");
    }

    public final void O0(Attributes attributes) {
        l("<path>", new Object[0]);
        if (this.b == null) {
            throw new w7.j("Invalid document. Root element must be <svg>");
        }
        g.v vVar = new g.v();
        vVar.f33972a = this.f34071a;
        vVar.b = this.b;
        D(vVar, attributes);
        S(vVar, attributes);
        W(vVar, attributes);
        C(vVar, attributes);
        L(vVar, attributes);
        this.b.a(vVar);
    }

    public final void P(g.b0 b0Var, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String trim = attributes.getValue(i10).trim();
            int i11 = a.b[g.a(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                b0Var.f33848o = o0(trim);
            } else if (i11 == 2) {
                b0Var.f33849p = o0(trim);
            } else if (i11 == 3) {
                g.p o02 = o0(trim);
                b0Var.f33850q = o02;
                if (o02.i()) {
                    throw new w7.j("Invalid <rect> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                g.p o03 = o0(trim);
                b0Var.f33851r = o03;
                if (o03.i()) {
                    throw new w7.j("Invalid <rect> element. height cannot be negative");
                }
            } else if (i11 == 10) {
                g.p o04 = o0(trim);
                b0Var.f33852s = o04;
                if (o04.i()) {
                    throw new w7.j("Invalid <rect> element. rx cannot be negative");
                }
            } else if (i11 != 11) {
                continue;
            } else {
                g.p o05 = o0(trim);
                b0Var.f33853t = o05;
                if (o05.i()) {
                    throw new w7.j("Invalid <rect> element. ry cannot be negative");
                }
            }
        }
    }

    public final void P0(Attributes attributes) {
        l("<pattern>", new Object[0]);
        if (this.b == null) {
            throw new w7.j("Invalid document. Root element must be <svg>");
        }
        g.y yVar = new g.y();
        yVar.f33972a = this.f34071a;
        yVar.b = this.b;
        D(yVar, attributes);
        S(yVar, attributes);
        C(yVar, attributes);
        Y(yVar, attributes);
        M(yVar, attributes);
        this.b.a(yVar);
        this.b = yVar;
    }

    public final void Q(g.f0 f0Var, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String trim = attributes.getValue(i10).trim();
            int i11 = a.b[g.a(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                f0Var.f33931q = o0(trim);
            } else if (i11 == 2) {
                f0Var.f33932r = o0(trim);
            } else if (i11 == 3) {
                g.p o02 = o0(trim);
                f0Var.f33933s = o02;
                if (o02.i()) {
                    throw new w7.j("Invalid <svg> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                g.p o03 = o0(trim);
                f0Var.f33934t = o03;
                if (o03.i()) {
                    throw new w7.j("Invalid <svg> element. height cannot be negative");
                }
            } else if (i11 == 5) {
                f0Var.f33935u = trim;
            }
        }
    }

    public final void Q0(Attributes attributes) {
        l("<polygon>", new Object[0]);
        if (this.b == null) {
            throw new w7.j("Invalid document. Root element must be <svg>");
        }
        g.z a0Var = new g.a0();
        a0Var.f33972a = this.f34071a;
        a0Var.b = this.b;
        D(a0Var, attributes);
        S(a0Var, attributes);
        W(a0Var, attributes);
        C(a0Var, attributes);
        N(a0Var, attributes, "polygon");
        this.b.a(a0Var);
    }

    public final void R(g.d0 d0Var, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String trim = attributes.getValue(i10).trim();
            if (a.b[g.a(attributes.getLocalName(i10)).ordinal()] == 37) {
                d0Var.f33862h = n0(trim);
            }
        }
    }

    public final void R0(Attributes attributes) {
        l("<polyline>", new Object[0]);
        if (this.b == null) {
            throw new w7.j("Invalid document. Root element must be <svg>");
        }
        g.z zVar = new g.z();
        zVar.f33972a = this.f34071a;
        zVar.b = this.b;
        D(zVar, attributes);
        S(zVar, attributes);
        W(zVar, attributes);
        C(zVar, attributes);
        N(zVar, attributes, "polyline");
        this.b.a(zVar);
    }

    public final void S(g.l0 l0Var, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String trim = attributes.getValue(i10).trim();
            if (trim.length() != 0) {
                int i11 = a.b[g.a(attributes.getLocalName(i10)).ordinal()];
                if (i11 == 45) {
                    E0(l0Var, trim);
                } else if (i11 != 46) {
                    if (l0Var.f33964e == null) {
                        l0Var.f33964e = new g.e0();
                    }
                    S0(l0Var.f33964e, attributes.getLocalName(i10), attributes.getValue(i10).trim());
                } else {
                    l0Var.f33966g = w7.b.f(trim);
                }
            }
        }
    }

    public final void T(g.u0 u0Var, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String trim = attributes.getValue(i10).trim();
            if (a.b[g.a(attributes.getLocalName(i10)).ordinal()] == 6 && ("".equals(attributes.getURI(i10)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i10)))) {
                u0Var.f34004o = trim;
            }
        }
    }

    public final void T0(Attributes attributes) {
        l("<radialGradient>", new Object[0]);
        if (this.b == null) {
            throw new w7.j("Invalid document. Root element must be <svg>");
        }
        g.q0 q0Var = new g.q0();
        q0Var.f33972a = this.f34071a;
        q0Var.b = this.b;
        D(q0Var, attributes);
        S(q0Var, attributes);
        F(q0Var, attributes);
        O(q0Var, attributes);
        this.b.a(q0Var);
        this.b = q0Var;
    }

    public final void U(g.z0 z0Var, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String trim = attributes.getValue(i10).trim();
            int i11 = a.b[g.a(attributes.getLocalName(i10)).ordinal()];
            if (i11 != 6) {
                if (i11 == 39) {
                    z0Var.f34023p = o0(trim);
                }
            } else if ("".equals(attributes.getURI(i10)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i10))) {
                z0Var.f34022o = trim;
            }
        }
    }

    public final void U0(Attributes attributes) {
        l("<rect>", new Object[0]);
        if (this.b == null) {
            throw new w7.j("Invalid document. Root element must be <svg>");
        }
        g.b0 b0Var = new g.b0();
        b0Var.f33972a = this.f34071a;
        b0Var.b = this.b;
        D(b0Var, attributes);
        S(b0Var, attributes);
        W(b0Var, attributes);
        C(b0Var, attributes);
        P(b0Var, attributes);
        this.b.a(b0Var);
    }

    public final void V(g.a1 a1Var, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String trim = attributes.getValue(i10).trim();
            int i11 = a.b[g.a(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                a1Var.f33841o = p0(trim);
            } else if (i11 == 2) {
                a1Var.f33842p = p0(trim);
            } else if (i11 == 19) {
                a1Var.f33843q = p0(trim);
            } else if (i11 == 20) {
                a1Var.f33844r = p0(trim);
            }
        }
    }

    public final void V0(Attributes attributes) {
        l("<solidColor>", new Object[0]);
        if (this.b == null) {
            throw new w7.j("Invalid document. Root element must be <svg>");
        }
        g.c0 c0Var = new g.c0();
        c0Var.f33972a = this.f34071a;
        c0Var.b = this.b;
        D(c0Var, attributes);
        S(c0Var, attributes);
        this.b.a(c0Var);
        this.b = c0Var;
    }

    public final void W(g.n nVar, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            if (g.a(attributes.getLocalName(i10)) == g.transform) {
                nVar.k(J0(attributes.getValue(i10)));
            }
        }
    }

    public final void W0() {
        this.f34071a = new w7.g();
    }

    public final void X(g.e1 e1Var, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String trim = attributes.getValue(i10).trim();
            int i11 = a.b[g.a(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                e1Var.f33925q = o0(trim);
            } else if (i11 == 2) {
                e1Var.f33926r = o0(trim);
            } else if (i11 == 3) {
                g.p o02 = o0(trim);
                e1Var.f33927s = o02;
                if (o02.i()) {
                    throw new w7.j("Invalid <use> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                g.p o03 = o0(trim);
                e1Var.f33928t = o03;
                if (o03.i()) {
                    throw new w7.j("Invalid <use> element. height cannot be negative");
                }
            } else if (i11 == 6 && ("".equals(attributes.getURI(i10)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i10)))) {
                e1Var.f33924p = trim;
            }
        }
    }

    public final void X0(String str, String str2, String str3, Attributes attributes) {
        if (this.f34072c) {
            this.f34073d++;
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            h a10 = h.a(str2);
            switch (a.f34079a[a10.ordinal()]) {
                case 1:
                    a1(attributes);
                    break;
                case 2:
                case 3:
                    q(attributes);
                    break;
                case 4:
                    m(attributes);
                    break;
                case 5:
                    i1(attributes);
                    break;
                case 6:
                    O0(attributes);
                    break;
                case 7:
                    U0(attributes);
                    break;
                case 8:
                    i(attributes);
                    break;
                case 9:
                    n(attributes);
                    break;
                case 10:
                    v(attributes);
                    break;
                case 11:
                    R0(attributes);
                    break;
                case 12:
                    Q0(attributes);
                    break;
                case 13:
                    d1(attributes);
                    break;
                case 14:
                    h1(attributes);
                    break;
                case 15:
                    g1(attributes);
                    break;
                case 16:
                    k1(attributes);
                    break;
                case 17:
                    b1(attributes);
                    break;
                case 18:
                    x(attributes);
                    break;
                case 19:
                    w(attributes);
                    break;
                case 20:
                    T0(attributes);
                    break;
                case MotionEventCompat.AXIS_WHEEL /* 21 */:
                    Y0(attributes);
                    break;
                case MotionEventCompat.AXIS_GAS /* 22 */:
                case MotionEventCompat.AXIS_BRAKE /* 23 */:
                    this.f34074e = true;
                    this.f34075f = a10;
                    break;
                case MotionEventCompat.AXIS_DISTANCE /* 24 */:
                    k(attributes);
                    break;
                case 25:
                    f1(attributes);
                    break;
                case MotionEventCompat.AXIS_SCROLL /* 26 */:
                    P0(attributes);
                    break;
                case MotionEventCompat.AXIS_RELATIVE_X /* 27 */:
                    u(attributes);
                    break;
                case MotionEventCompat.AXIS_RELATIVE_Y /* 28 */:
                    j1(attributes);
                    break;
                case 29:
                    y(attributes);
                    break;
                case BacktraceMetrics.defaultTimeIntervalInMin /* 30 */:
                    Z0(attributes);
                    break;
                case 31:
                    V0(attributes);
                    break;
                default:
                    this.f34072c = true;
                    this.f34073d = 1;
                    break;
            }
        }
    }

    public final void Y(g.r0 r0Var, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String trim = attributes.getValue(i10).trim();
            int i11 = a.b[g.a(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 7) {
                w0(r0Var, trim);
            } else if (i11 == 87) {
                r0Var.f33996p = N0(trim);
            }
        }
    }

    public final void Y0(Attributes attributes) {
        l("<stop>", new Object[0]);
        g.j0 j0Var = this.b;
        if (j0Var == null) {
            throw new w7.j("Invalid document. Root element must be <svg>");
        }
        if (!(j0Var instanceof g.j)) {
            throw new w7.j("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.");
        }
        g.d0 d0Var = new g.d0();
        d0Var.f33972a = this.f34071a;
        d0Var.b = this.b;
        D(d0Var, attributes);
        S(d0Var, attributes);
        R(d0Var, attributes);
        this.b.a(d0Var);
        this.b = d0Var;
    }

    public final void Z(String str) {
        this.f34071a.a(new w7.b(b.f.screen, b.u.Document).d(str));
    }

    public final void Z0(Attributes attributes) {
        l("<style>", new Object[0]);
        if (this.b == null) {
            throw new w7.j("Invalid document. Root element must be <svg>");
        }
        String str = "all";
        boolean z10 = true;
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String trim = attributes.getValue(i10).trim();
            int i11 = a.b[g.a(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 88) {
                z10 = trim.equals("text/css");
            } else if (i11 == 89) {
                str = trim;
            }
        }
        if (z10 && w7.b.b(str, b.f.screen)) {
            this.f34077h = true;
        } else {
            this.f34072c = true;
            this.f34073d = 1;
        }
    }

    public final void a1(Attributes attributes) {
        l("<svg>", new Object[0]);
        g.f0 f0Var = new g.f0();
        f0Var.f33972a = this.f34071a;
        f0Var.b = this.b;
        D(f0Var, attributes);
        S(f0Var, attributes);
        C(f0Var, attributes);
        Y(f0Var, attributes);
        Q(f0Var, attributes);
        g.j0 j0Var = this.b;
        if (j0Var == null) {
            this.f34071a.u(f0Var);
        } else {
            j0Var.a(f0Var);
        }
        this.b = f0Var;
    }

    public final void b1(Attributes attributes) {
        l("<symbol>", new Object[0]);
        if (this.b == null) {
            throw new w7.j("Invalid document. Root element must be <svg>");
        }
        g.r0 t0Var = new g.t0();
        t0Var.f33972a = this.f34071a;
        t0Var.b = this.b;
        D(t0Var, attributes);
        S(t0Var, attributes);
        C(t0Var, attributes);
        Y(t0Var, attributes);
        this.b.a(t0Var);
        this.b = t0Var;
    }

    public final void c1(String str) {
        if (this.f34072c) {
            return;
        }
        if (this.f34074e) {
            if (this.f34076g == null) {
                this.f34076g = new StringBuilder(str.length());
            }
            this.f34076g.append(str);
        } else if (this.f34077h) {
            if (this.f34078i == null) {
                this.f34078i = new StringBuilder(str.length());
            }
            this.f34078i.append(str);
        } else if (this.b instanceof g.y0) {
            h(str);
        }
    }

    public final void d1(Attributes attributes) {
        l("<text>", new Object[0]);
        if (this.b == null) {
            throw new w7.j("Invalid document. Root element must be <svg>");
        }
        g.w0 w0Var = new g.w0();
        w0Var.f33972a = this.f34071a;
        w0Var.b = this.b;
        D(w0Var, attributes);
        S(w0Var, attributes);
        W(w0Var, attributes);
        C(w0Var, attributes);
        V(w0Var, attributes);
        this.b.a(w0Var);
        this.b = w0Var;
    }

    public final void e1(char[] cArr, int i10, int i11) {
        if (this.f34072c) {
            return;
        }
        if (this.f34074e) {
            if (this.f34076g == null) {
                this.f34076g = new StringBuilder(i11);
            }
            this.f34076g.append(cArr, i10, i11);
        } else if (this.f34077h) {
            if (this.f34078i == null) {
                this.f34078i = new StringBuilder(i11);
            }
            this.f34078i.append(cArr, i10, i11);
        } else if (this.b instanceof g.y0) {
            h(new String(cArr, i10, i11));
        }
    }

    public final void f1(Attributes attributes) {
        l("<textPath>", new Object[0]);
        if (this.b == null) {
            throw new w7.j("Invalid document. Root element must be <svg>");
        }
        g.z0 z0Var = new g.z0();
        z0Var.f33972a = this.f34071a;
        z0Var.b = this.b;
        D(z0Var, attributes);
        S(z0Var, attributes);
        C(z0Var, attributes);
        U(z0Var, attributes);
        this.b.a(z0Var);
        this.b = z0Var;
        g.j0 j0Var = z0Var.b;
        if (j0Var instanceof g.b1) {
            z0Var.o((g.b1) j0Var);
        } else {
            z0Var.o(((g.x0) j0Var).e());
        }
    }

    public final void g1(Attributes attributes) {
        l("<tref>", new Object[0]);
        g.j0 j0Var = this.b;
        if (j0Var == null) {
            throw new w7.j("Invalid document. Root element must be <svg>");
        }
        if (!(j0Var instanceof g.y0)) {
            throw new w7.j("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
        }
        g.u0 u0Var = new g.u0();
        u0Var.f33972a = this.f34071a;
        u0Var.b = this.b;
        D(u0Var, attributes);
        S(u0Var, attributes);
        C(u0Var, attributes);
        T(u0Var, attributes);
        this.b.a(u0Var);
        g.j0 j0Var2 = u0Var.b;
        if (j0Var2 instanceof g.b1) {
            u0Var.o((g.b1) j0Var2);
        } else {
            u0Var.o(((g.x0) j0Var2).e());
        }
    }

    public final void h(String str) {
        g.h0 h0Var = (g.h0) this.b;
        int size = h0Var.f33937i.size();
        g.n0 n0Var = size == 0 ? null : h0Var.f33937i.get(size - 1);
        if (!(n0Var instanceof g.c1)) {
            this.b.a(new g.c1(str));
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        g.c1 c1Var = (g.c1) n0Var;
        sb2.append(c1Var.f33857c);
        sb2.append(str);
        c1Var.f33857c = sb2.toString();
    }

    public final void h1(Attributes attributes) {
        l("<tspan>", new Object[0]);
        g.j0 j0Var = this.b;
        if (j0Var == null) {
            throw new w7.j("Invalid document. Root element must be <svg>");
        }
        if (!(j0Var instanceof g.y0)) {
            throw new w7.j("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
        }
        g.v0 v0Var = new g.v0();
        v0Var.f33972a = this.f34071a;
        v0Var.b = this.b;
        D(v0Var, attributes);
        S(v0Var, attributes);
        C(v0Var, attributes);
        V(v0Var, attributes);
        this.b.a(v0Var);
        this.b = v0Var;
        g.j0 j0Var2 = v0Var.b;
        if (j0Var2 instanceof g.b1) {
            v0Var.o((g.b1) j0Var2);
        } else {
            v0Var.o(((g.x0) j0Var2).e());
        }
    }

    public final void i(Attributes attributes) {
        l("<circle>", new Object[0]);
        if (this.b == null) {
            throw new w7.j("Invalid document. Root element must be <svg>");
        }
        g.d dVar = new g.d();
        dVar.f33972a = this.f34071a;
        dVar.b = this.b;
        D(dVar, attributes);
        S(dVar, attributes);
        W(dVar, attributes);
        C(dVar, attributes);
        A(dVar, attributes);
        this.b.a(dVar);
    }

    public final void i1(Attributes attributes) {
        l("<use>", new Object[0]);
        if (this.b == null) {
            throw new w7.j("Invalid document. Root element must be <svg>");
        }
        g.e1 e1Var = new g.e1();
        e1Var.f33972a = this.f34071a;
        e1Var.b = this.b;
        D(e1Var, attributes);
        S(e1Var, attributes);
        W(e1Var, attributes);
        C(e1Var, attributes);
        X(e1Var, attributes);
        this.b.a(e1Var);
        this.b = e1Var;
    }

    public final void j1(Attributes attributes) {
        l("<view>", new Object[0]);
        if (this.b == null) {
            throw new w7.j("Invalid document. Root element must be <svg>");
        }
        g.r0 f1Var = new g.f1();
        f1Var.f33972a = this.f34071a;
        f1Var.b = this.b;
        D(f1Var, attributes);
        C(f1Var, attributes);
        Y(f1Var, attributes);
        this.b.a(f1Var);
        this.b = f1Var;
    }

    public final void k(Attributes attributes) {
        l("<clipPath>", new Object[0]);
        if (this.b == null) {
            throw new w7.j("Invalid document. Root element must be <svg>");
        }
        g.e eVar = new g.e();
        eVar.f33972a = this.f34071a;
        eVar.b = this.b;
        D(eVar, attributes);
        S(eVar, attributes);
        W(eVar, attributes);
        C(eVar, attributes);
        B(eVar, attributes);
        this.b.a(eVar);
        this.b = eVar;
    }

    public final void k1(Attributes attributes) {
        l("<switch>", new Object[0]);
        if (this.b == null) {
            throw new w7.j("Invalid document. Root element must be <svg>");
        }
        g.s0 s0Var = new g.s0();
        s0Var.f33972a = this.f34071a;
        s0Var.b = this.b;
        D(s0Var, attributes);
        S(s0Var, attributes);
        W(s0Var, attributes);
        C(s0Var, attributes);
        this.b.a(s0Var);
        this.b = s0Var;
    }

    public final void l(String str, Object... objArr) {
    }

    public final void m(Attributes attributes) {
        l("<defs>", new Object[0]);
        if (this.b == null) {
            throw new w7.j("Invalid document. Root element must be <svg>");
        }
        g.h hVar = new g.h();
        hVar.f33972a = this.f34071a;
        hVar.b = this.b;
        D(hVar, attributes);
        S(hVar, attributes);
        W(hVar, attributes);
        this.b.a(hVar);
        this.b = hVar;
    }

    public final void n(Attributes attributes) {
        l("<ellipse>", new Object[0]);
        if (this.b == null) {
            throw new w7.j("Invalid document. Root element must be <svg>");
        }
        g.i iVar = new g.i();
        iVar.f33972a = this.f34071a;
        iVar.b = this.b;
        D(iVar, attributes);
        S(iVar, attributes);
        W(iVar, attributes);
        C(iVar, attributes);
        E(iVar, attributes);
        this.b.a(iVar);
    }

    public final Float n0(String str) {
        if (str.length() == 0) {
            throw new w7.j("Invalid offset value in <stop> (empty string)");
        }
        int length = str.length();
        boolean z10 = true;
        if (str.charAt(str.length() - 1) == '%') {
            length--;
        } else {
            z10 = false;
        }
        try {
            float g02 = g0(str, 0, length);
            float f10 = 100.0f;
            if (z10) {
                g02 /= 100.0f;
            }
            if (g02 < 0.0f) {
                f10 = 0.0f;
            } else if (g02 <= 100.0f) {
                f10 = g02;
            }
            return Float.valueOf(f10);
        } catch (NumberFormatException e10) {
            throw new w7.j("Invalid offset value in <stop>: " + str, e10);
        }
    }

    public final void o() {
    }

    public final void p(String str, String str2, String str3) {
        if (this.f34072c) {
            int i10 = this.f34073d - 1;
            this.f34073d = i10;
            if (i10 == 0) {
                this.f34072c = false;
                return;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            int i11 = a.f34079a[h.a(str2).ordinal()];
            if (i11 != 1 && i11 != 2 && i11 != 4 && i11 != 5 && i11 != 13 && i11 != 14) {
                switch (i11) {
                    case MotionEventCompat.AXIS_GAS /* 22 */:
                    case MotionEventCompat.AXIS_BRAKE /* 23 */:
                        this.f34074e = false;
                        StringBuilder sb2 = this.f34076g;
                        if (sb2 != null) {
                            h hVar = this.f34075f;
                            if (hVar == h.title) {
                                this.f34071a.v(sb2.toString());
                            } else if (hVar == h.desc) {
                                this.f34071a.q(sb2.toString());
                            }
                            this.f34076g.setLength(0);
                            break;
                        }
                        break;
                    case BacktraceMetrics.defaultTimeIntervalInMin /* 30 */:
                        StringBuilder sb3 = this.f34078i;
                        if (sb3 != null) {
                            this.f34077h = false;
                            Z(sb3.toString());
                            this.f34078i.setLength(0);
                            break;
                        }
                        break;
                }
                return;
            }
            this.b = ((g.n0) this.b).b;
        }
    }

    public final void q(Attributes attributes) {
        l("<g>", new Object[0]);
        if (this.b == null) {
            throw new w7.j("Invalid document. Root element must be <svg>");
        }
        g.m mVar = new g.m();
        mVar.f33972a = this.f34071a;
        mVar.b = this.b;
        D(mVar, attributes);
        S(mVar, attributes);
        W(mVar, attributes);
        C(mVar, attributes);
        this.b.a(mVar);
        this.b = mVar;
    }

    public final void r(String str, Map<String, String> map) {
        if (str.equals("xml-stylesheet")) {
            w7.g.k();
        }
    }

    public final void u(Attributes attributes) {
        l("<image>", new Object[0]);
        if (this.b == null) {
            throw new w7.j("Invalid document. Root element must be <svg>");
        }
        g.o oVar = new g.o();
        oVar.f33972a = this.f34071a;
        oVar.b = this.b;
        D(oVar, attributes);
        S(oVar, attributes);
        W(oVar, attributes);
        C(oVar, attributes);
        G(oVar, attributes);
        this.b.a(oVar);
        this.b = oVar;
    }

    public final void v(Attributes attributes) {
        l("<line>", new Object[0]);
        if (this.b == null) {
            throw new w7.j("Invalid document. Root element must be <svg>");
        }
        g.q qVar = new g.q();
        qVar.f33972a = this.f34071a;
        qVar.b = this.b;
        D(qVar, attributes);
        S(qVar, attributes);
        W(qVar, attributes);
        C(qVar, attributes);
        H(qVar, attributes);
        this.b.a(qVar);
    }

    public final void w(Attributes attributes) {
        l("<linearGradient>", new Object[0]);
        if (this.b == null) {
            throw new w7.j("Invalid document. Root element must be <svg>");
        }
        g.m0 m0Var = new g.m0();
        m0Var.f33972a = this.f34071a;
        m0Var.b = this.b;
        D(m0Var, attributes);
        S(m0Var, attributes);
        F(m0Var, attributes);
        I(m0Var, attributes);
        this.b.a(m0Var);
        this.b = m0Var;
    }

    public final void x(Attributes attributes) {
        l("<marker>", new Object[0]);
        if (this.b == null) {
            throw new w7.j("Invalid document. Root element must be <svg>");
        }
        g.r rVar = new g.r();
        rVar.f33972a = this.f34071a;
        rVar.b = this.b;
        D(rVar, attributes);
        S(rVar, attributes);
        C(rVar, attributes);
        Y(rVar, attributes);
        J(rVar, attributes);
        this.b.a(rVar);
        this.b = rVar;
    }

    public final Map<String, String> x0(i iVar) {
        HashMap hashMap = new HashMap();
        iVar.A();
        String s8 = iVar.s('=');
        while (s8 != null) {
            iVar.f('=');
            hashMap.put(s8, iVar.q());
            iVar.A();
            s8 = iVar.s('=');
        }
        return hashMap;
    }

    public final void y(Attributes attributes) {
        l("<mask>", new Object[0]);
        if (this.b == null) {
            throw new w7.j("Invalid document. Root element must be <svg>");
        }
        g.s sVar = new g.s();
        sVar.f33972a = this.f34071a;
        sVar.b = this.b;
        D(sVar, attributes);
        S(sVar, attributes);
        C(sVar, attributes);
        K(sVar, attributes);
        this.b.a(sVar);
        this.b = sVar;
    }

    public w7.g z(InputStream inputStream, boolean z10) {
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        try {
            inputStream.mark(3);
            int read = inputStream.read() + (inputStream.read() << 8);
            inputStream.reset();
            if (read == 35615) {
                inputStream = new BufferedInputStream(new GZIPInputStream(inputStream));
            }
        } catch (IOException unused) {
        }
        try {
            inputStream.mark(4096);
            L0(inputStream, z10);
            return this.f34071a;
        } finally {
            try {
                inputStream.close();
            } catch (IOException unused2) {
                Log.e("SVGParser", "Exception thrown closing input stream");
            }
        }
    }
}
