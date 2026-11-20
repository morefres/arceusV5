package com.google.android.gms.internal.play_billing;

import androidx.core.view.MotionEventCompat;
import backtraceio.library.services.BacktraceMetrics;

/* loaded from: classes.dex */
public final class m7 implements w4 {

    /* renamed from: a, reason: collision with root package name */
    public static final w4 f7233a = new m7();

    @Override // com.google.android.gms.internal.play_billing.w4
    public final boolean a(int i10) {
        switch (i10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return true;
            default:
                switch (i10) {
                    case MotionEventCompat.AXIS_GAS /* 22 */:
                    case MotionEventCompat.AXIS_BRAKE /* 23 */:
                    case MotionEventCompat.AXIS_DISTANCE /* 24 */:
                    case 25:
                    case MotionEventCompat.AXIS_SCROLL /* 26 */:
                    case MotionEventCompat.AXIS_RELATIVE_X /* 27 */:
                    case MotionEventCompat.AXIS_RELATIVE_Y /* 28 */:
                    case 29:
                    case BacktraceMetrics.defaultTimeIntervalInMin /* 30 */:
                    case 31:
                    case 32:
                    case MotionEventCompat.AXIS_GENERIC_2 /* 33 */:
                    case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
                    case 35:
                    case MotionEventCompat.AXIS_GENERIC_5 /* 36 */:
                    case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                    case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                    case MotionEventCompat.AXIS_GENERIC_8 /* 39 */:
                        return true;
                    default:
                        return false;
                }
        }
    }
}
