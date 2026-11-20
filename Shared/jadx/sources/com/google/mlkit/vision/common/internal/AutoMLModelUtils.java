package com.google.mlkit.vision.common.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.mlkit.common.internal.model.ModelUtils;
import com.google.mlkit.common.model.LocalModel;
import com.google.mlkit.common.sdkinternal.Constants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import n9.m;

/* loaded from: classes2.dex */
public class AutoMLModelUtils {
    private AutoMLModelUtils() {
    }

    @NonNull
    public static String[] getModelAndLabelFilePaths(@NonNull Context context, @NonNull LocalModel localModel, boolean z10) {
        String str;
        String str2 = z10 ? (String) m.l(localModel.getAssetFilePath()) : (String) m.l(localModel.getAbsoluteFilePath());
        if (localModel.isManifestFile()) {
            ModelUtils.AutoMLManifest parseManifestFile = ModelUtils.parseManifestFile(str2, z10, context);
            if (parseManifestFile == null) {
                throw new IOException("Failed to parse manifest file.");
            }
            m.r(Constants.AUTOML_IMAGE_LABELING_MODEL_TYPE.equals(parseManifestFile.getModelType()), "Model type should be: %s.", Constants.AUTOML_IMAGE_LABELING_MODEL_TYPE);
            str2 = new File(new File(str2).getParent(), parseManifestFile.getModelFile()).toString();
            str = new File(new File(str2).getParent(), parseManifestFile.getLabelsFile()).toString();
        } else {
            str = "";
        }
        return new String[]{str2, str};
    }

    @NonNull
    public static List<String> readLabelsFile(@NonNull Context context, @NonNull String str, boolean z10) {
        ArrayList arrayList = new ArrayList();
        InputStream open = z10 ? context.getAssets().open(str) : new FileInputStream(new File(str));
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open, "UTF-8"));
            for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                arrayList.add(readLine);
            }
            if (open != null) {
                open.close();
            }
            return arrayList;
        } catch (Throwable th2) {
            if (open != null) {
                try {
                    open.close();
                } catch (Throwable th3) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                    } catch (Exception unused) {
                    }
                }
            }
            throw th2;
        }
    }
}
