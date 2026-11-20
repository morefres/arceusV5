package ae;

import android.util.Log;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public final class e0 {
    public static final n0 a(XmlPullParser xmlPullParser, l0 l0Var) {
        while (xmlPullParser.next() != 1) {
            try {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("splits")) {
                        while (xmlPullParser.next() != 3) {
                            if (xmlPullParser.getEventType() == 2) {
                                if (xmlPullParser.getName().equals("module")) {
                                    String b = b("name", xmlPullParser, l0Var);
                                    if (b != null) {
                                        while (xmlPullParser.next() != 3) {
                                            if (xmlPullParser.getEventType() == 2) {
                                                if (xmlPullParser.getName().equals("language")) {
                                                    while (xmlPullParser.next() != 3) {
                                                        if (xmlPullParser.getEventType() == 2) {
                                                            if (xmlPullParser.getName().equals("entry")) {
                                                                String b10 = b("key", xmlPullParser, l0Var);
                                                                String b11 = b("split", xmlPullParser, l0Var);
                                                                c(xmlPullParser, l0Var);
                                                                if (b10 != null && b11 != null) {
                                                                    l0Var.a(b, b10, b11);
                                                                }
                                                            } else {
                                                                c(xmlPullParser, l0Var);
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    c(xmlPullParser, l0Var);
                                                }
                                            }
                                        }
                                    } else {
                                        c(xmlPullParser, l0Var);
                                    }
                                } else {
                                    c(xmlPullParser, l0Var);
                                }
                            }
                        }
                    } else {
                        c(xmlPullParser, l0Var);
                    }
                }
            } catch (IOException | IllegalStateException | XmlPullParserException e10) {
                Log.e("SplitInstall", "Error while parsing splits.xml", e10);
                return null;
            }
        }
        return l0Var.b();
    }

    public static final String b(String str, XmlPullParser xmlPullParser, l0 l0Var) {
        for (int i10 = 0; i10 < xmlPullParser.getAttributeCount(); i10++) {
            if (xmlPullParser.getAttributeName(i10).equals(str)) {
                return xmlPullParser.getAttributeValue(i10);
            }
        }
        return null;
    }

    public static final void c(XmlPullParser xmlPullParser, l0 l0Var) {
        int i10 = 1;
        while (i10 != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }
}
