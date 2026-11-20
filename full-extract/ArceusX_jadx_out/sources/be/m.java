package be;

import android.content.res.AssetManager;
import java.io.File;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final zd.b f3984a;
    public XmlPullParser b;

    public m(zd.b bVar) {
        this.f3984a = bVar;
    }

    public final long a() {
        if (this.b == null) {
            throw new XmlPullParserException("Manifest file needs to be loaded before parsing.");
        }
        while (true) {
            int next = this.b.next();
            if (next != 2) {
                if (next == 1) {
                    break;
                }
            } else if (this.b.getName().equals("manifest")) {
                String attributeValue = this.b.getAttributeValue("http://schemas.android.com/apk/res/android", "versionCode");
                String attributeValue2 = this.b.getAttributeValue("http://schemas.android.com/apk/res/android", "versionCodeMajor");
                if (attributeValue == null) {
                    throw new XmlPullParserException("Manifest entry doesn't contain 'versionCode' attribute.");
                }
                try {
                    int parseInt = Integer.parseInt(attributeValue);
                    if (attributeValue2 == null) {
                        return parseInt;
                    }
                    try {
                        return (Integer.parseInt(attributeValue2) << 32) | (parseInt & 4294967295L);
                    } catch (NumberFormatException e10) {
                        throw new XmlPullParserException(String.format("Couldn't parse versionCodeMajor to int: %s", e10.getMessage()));
                    }
                } catch (NumberFormatException e11) {
                    throw new XmlPullParserException(String.format("Couldn't parse versionCode to int: %s", e11.getMessage()));
                }
            }
        }
        throw new XmlPullParserException("Couldn't find manifest entry at top-level.");
    }

    public final void b(AssetManager assetManager, File file) {
        this.b = assetManager.openXmlResourceParser(zd.b.c(assetManager, file), "AndroidManifest.xml");
    }
}
