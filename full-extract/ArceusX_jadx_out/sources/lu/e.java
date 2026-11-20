package lu;

import androidx.core.view.inputmethod.EditorInfoCompat;
import gt.n;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ju.k3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import lu.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pu.b0;
import pu.c0;
import pu.d0;
import pu.e0;
import pu.s0;

@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b6\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0003:¨\u0001B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\"\b\u0002\u0010\b\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b\f\u0010\rJ6\u0010\u0013\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0016\u001a\u00020\u0006*\u00020\u00152\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJG\u0010 \u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!JG\u0010\"\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\"\u0010!J\u0017\u0010$\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u0011H\u0003¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u0011H\u0002¢\u0006\u0004\b'\u0010%J\u001b\u0010(\u001a\u00020\u001e*\u00020\u001c2\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b(\u0010)J.\u0010+\u001a\u00028\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b+\u0010,J)\u0010-\u001a\u00020\u0006*\u00020\u00152\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b-\u0010\u0017J\u001d\u0010.\u001a\u00020\u00062\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0002¢\u0006\u0004\b.\u0010/J4\u00101\u001a\b\u0012\u0004\u0012\u00028\u0000002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b1\u0010,J#\u00102\u001a\u00020\u00062\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0000000\u0018H\u0002¢\u0006\u0004\b2\u0010/J9\u00103\u001a\u0004\u0018\u00010\u001c2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b3\u00104J9\u00105\u001a\u0004\u0018\u00010\u001c2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b5\u00104J)\u00106\u001a\u00020\u001e*\u00020\u001c2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0006H\u0002¢\u0006\u0004\b8\u00109J-\u0010;\u001a\u00020\u001e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u0011H\u0002¢\u0006\u0004\b;\u0010<J-\u0010=\u001a\u00020\u001e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u0011H\u0002¢\u0006\u0004\b=\u0010<J\u0019\u0010?\u001a\u00020\u00062\b\b\u0002\u0010>\u001a\u00020\u0011H\u0002¢\u0006\u0004\b?\u0010@J%\u0010D\u001a\u00020\u00062\n\u0010B\u001a\u0006\u0012\u0002\b\u00030A2\b\u0010C\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\bD\u0010EJ\u001b\u0010F\u001a\u00020\u00062\n\u0010B\u001a\u0006\u0012\u0002\b\u00030AH\u0002¢\u0006\u0004\bF\u0010GJ%\u0010I\u001a\u0004\u0018\u00010\u001c2\b\u0010C\u001a\u0004\u0018\u00010\u001c2\b\u0010H\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\bI\u0010JJ%\u0010K\u001a\u0004\u0018\u00010\u001c2\b\u0010C\u001a\u0004\u0018\u00010\u001c2\b\u0010H\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\bK\u0010JJ\u000f\u0010L\u001a\u00020\u0006H\u0002¢\u0006\u0004\bL\u00109J\u000f\u0010M\u001a\u00020\u0006H\u0002¢\u0006\u0004\bM\u00109J\u000f\u0010N\u001a\u00020\u0006H\u0002¢\u0006\u0004\bN\u00109J\u000f\u0010O\u001a\u00020\u0006H\u0002¢\u0006\u0004\bO\u00109J\u000f\u0010P\u001a\u00020\u0006H\u0002¢\u0006\u0004\bP\u00109J\u001d\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010Q\u001a\u00020\u0011H\u0002¢\u0006\u0004\bR\u0010SJ\u0017\u0010T\u001a\u00020\u00062\u0006\u0010Q\u001a\u00020\u0011H\u0002¢\u0006\u0004\bT\u0010@J\u0015\u0010U\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bU\u0010VJ\u001d\u0010X\u001a\u00020\u00112\f\u0010W\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bX\u0010YJ\u001d\u0010Z\u001a\u00020\u00062\f\u0010W\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bZ\u0010[J%\u0010]\u001a\u00020\u00062\f\u0010W\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\\\u001a\u00020\u0011H\u0002¢\u0006\u0004\b]\u0010^J\u0013\u0010_\u001a\u00020\u0006*\u00020\u0015H\u0002¢\u0006\u0004\b_\u0010`J\u0013\u0010a\u001a\u00020\u0006*\u00020\u0015H\u0002¢\u0006\u0004\ba\u0010`J\u001b\u0010c\u001a\u00020\u0006*\u00020\u00152\u0006\u0010b\u001a\u00020\u001eH\u0002¢\u0006\u0004\bc\u0010dJ\u001f\u0010g\u001a\u00020\u001e2\u0006\u0010e\u001a\u00020\u00112\u0006\u0010f\u001a\u00020\u001eH\u0002¢\u0006\u0004\bg\u0010hJ-\u0010j\u001a\u00020\u001e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010i\u001a\u00020\u0011H\u0002¢\u0006\u0004\bj\u0010<J-\u0010m\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e2\u0006\u0010k\u001a\u00020\u00112\f\u0010l\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bm\u0010nJ-\u0010o\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e2\u0006\u0010k\u001a\u00020\u00112\f\u0010l\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bo\u0010nJ5\u0010q\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e2\u0006\u0010k\u001a\u00020\u00112\f\u0010l\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010p\u001a\u00020\u0011H\u0002¢\u0006\u0004\bq\u0010rJ%\u0010s\u001a\u00020\u00062\u0006\u0010k\u001a\u00020\u00112\f\u0010l\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bs\u0010tJ\u0017\u0010v\u001a\u00020\u00062\u0006\u0010u\u001a\u00020\u0011H\u0002¢\u0006\u0004\bv\u0010@J\u0017\u0010w\u001a\u00020\u00062\u0006\u0010u\u001a\u00020\u0011H\u0002¢\u0006\u0004\bw\u0010@JG\u0010{\u001a \u0012\u0004\u0012\u00020y\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000000\u0012\u0004\u0012\u00020z\u0012\u0004\u0012\u00020\u00060x*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00028\u0000`\u0007H\u0002¢\u0006\u0004\b{\u0010|J.\u0010\u007f\u001a\u00020\u00062\u0006\u0010}\u001a\u00020y2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u0000002\u0006\u0010~\u001a\u00020zH\u0002¢\u0006\u0005\b\u007f\u0010\u0080\u0001JO\u0010\u0082\u0001\u001a\u001d\u0012\u0004\u0012\u00020y\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020z\u0012\u0004\u0012\u00020\u00060\u0081\u0001*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00028\u0000`\u00072\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001JC\u0010\u0084\u0001\u001a\u001a\u0012\u0004\u0012\u00020y\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020z\u0012\u0004\u0012\u00020\u00060x*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00028\u0000`\u0007H\u0002¢\u0006\u0005\b\u0084\u0001\u0010|J*\u0010\u0085\u0001\u001a\u00020\u00062\u0006\u0010}\u001a\u00020y2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010~\u001a\u00020zH\u0002¢\u0006\u0006\b\u0085\u0001\u0010\u0080\u0001J\u0018\u0010\u0001\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0001\u0010\rJ \u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u00020\u0006002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J \u0010\u0088\u0001\u001a\b\u0012\u0004\u0012\u00020\u0006002\u0006\u0010\u000b\u001a\u00028\u0000H\u0004¢\u0006\u0006\b\u0088\u0001\u0010\u0087\u0001J\u0011\u0010\u0089\u0001\u001a\u00020\u0006H\u0014¢\u0006\u0005\b\u0089\u0001\u00109J\u0011\u0010\u008a\u0001\u001a\u00020\u0006H\u0014¢\u0006\u0005\b\u008a\u0001\u00109J\u0013\u0010\u008b\u0001\u001a\u00028\u0000H\u0096@¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u0019\u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u00028\u000000H\u0096@¢\u0006\u0006\b\u008d\u0001\u0010\u008c\u0001J\u0018\u0010\u008e\u0001\u001a\b\u0012\u0004\u0012\u00028\u000000H\u0016¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u001a\u0010\u0091\u0001\u001a\u00020\u00062\u0007\u0010\u0090\u0001\u001a\u00020\u0011H\u0004¢\u0006\u0005\b\u0091\u0001\u0010@J\u0019\u0010\u0092\u0001\u001a\u00020\u00062\u0006\u0010i\u001a\u00020\u0011H\u0000¢\u0006\u0005\b\u0092\u0001\u0010@J\u001a\u0010\u0094\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0093\u0001H\u0096\u0002¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u0011\u0010\u0096\u0001\u001a\u00020\u0006H\u0014¢\u0006\u0005\b\u0096\u0001\u00109J\u001c\u0010\u0097\u0001\u001a\u00020\u001e2\b\u0010}\u001a\u0004\u0018\u00010yH\u0016¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\"\u0010\u009b\u0001\u001a\u00020\u00062\u0010\u0010}\u001a\f\u0018\u00010\u0099\u0001j\u0005\u0018\u0001`\u009a\u0001¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J\u001c\u0010\u009d\u0001\u001a\u00020\u001e2\b\u0010}\u001a\u0004\u0018\u00010yH\u0010¢\u0006\u0006\b\u009d\u0001\u0010\u0098\u0001J%\u0010\u009f\u0001\u001a\u00020\u001e2\b\u0010}\u001a\u0004\u0018\u00010y2\u0007\u0010\u009e\u0001\u001a\u00020\u001eH\u0014¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J'\u0010\u0012\u001a\u00020\u00062\u0015\u0010¡\u0001\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010y\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¢\u0006\u0005\b\u0012\u0010¢\u0001J\u0012\u0010£\u0001\u001a\u00020\u001eH\u0000¢\u0006\u0006\b£\u0001\u0010¤\u0001J\u0013\u0010¦\u0001\u001a\u00030¥\u0001H\u0016¢\u0006\u0006\b¦\u0001\u0010§\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R/\u0010\b\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00078\u0000X\u0081\u0004¢\u0006\u0007\n\u0005\b:\u0010ª\u0001Rc\u0010®\u0001\u001aG\u0012\b\u0012\u0006\u0012\u0002\b\u00030A\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020y\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020z\u0012\u0004\u0012\u00020\u00060\u0081\u0001\u0018\u00010\u0081\u0001j\u0005\u0018\u0001`«\u00018\u0002X\u0082\u0004¢\u0006\u000f\n\u0006\b\u009b\u0001\u0010¬\u0001\u0012\u0005\b\u00ad\u0001\u00109R\u0017\u0010±\u0001\u001a\u00020\u00118BX\u0082\u0004¢\u0006\b\u001a\u0006\b¯\u0001\u0010°\u0001R\u0017\u0010³\u0001\u001a\u00020\u001e8BX\u0082\u0004¢\u0006\b\u001a\u0006\b²\u0001\u0010¤\u0001R\u0017\u0010¶\u0001\u001a\u00020y8BX\u0082\u0004¢\u0006\b\u001a\u0006\b´\u0001\u0010µ\u0001R\u001a\u0010¸\u0001\u001a\u00020\u001e*\u00020\u00118BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b·\u0001\u0010%R\u001a\u0010º\u0001\u001a\u00020\u001e*\u00020\u00118BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¹\u0001\u0010%R\u0016\u0010\\\u001a\u00020\u00118@X\u0080\u0004¢\u0006\b\u001a\u0006\b»\u0001\u0010°\u0001R\u0017\u0010½\u0001\u001a\u00020\u00118@X\u0080\u0004¢\u0006\b\u001a\u0006\b¼\u0001\u0010°\u0001R%\u0010Â\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000¾\u00018VX\u0096\u0004¢\u0006\u000f\u0012\u0005\bÁ\u0001\u00109\u001a\u0006\b¿\u0001\u0010À\u0001R+\u0010Å\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0000000¾\u00018VX\u0096\u0004¢\u0006\u000f\u0012\u0005\bÄ\u0001\u00109\u001a\u0006\bÃ\u0001\u0010À\u0001R\u0019\u0010Ç\u0001\u001a\u0004\u0018\u00010y8DX\u0084\u0004¢\u0006\b\u001a\u0006\bÆ\u0001\u0010µ\u0001R\u0017\u0010É\u0001\u001a\u00020y8DX\u0084\u0004¢\u0006\b\u001a\u0006\bÈ\u0001\u0010µ\u0001R\u0017\u0010Ë\u0001\u001a\u00020\u001e8TX\u0094\u0004¢\u0006\b\u001a\u0006\bÊ\u0001\u0010¤\u0001R\u001e\u0010Î\u0001\u001a\u00020\u001e8VX\u0097\u0004¢\u0006\u000f\u0012\u0005\bÍ\u0001\u00109\u001a\u0006\bÌ\u0001\u0010¤\u0001R\u001d\u0010f\u001a\u00020\u001e8VX\u0097\u0004¢\u0006\u000f\u0012\u0005\bÐ\u0001\u00109\u001a\u0006\bÏ\u0001\u0010¤\u0001R\r\u0010Ò\u0001\u001a\u00030Ñ\u00018\u0002X\u0082\u0004R\r\u0010Ó\u0001\u001a\u00030Ñ\u00018\u0002X\u0082\u0004R\r\u0010Ô\u0001\u001a\u00030Ñ\u00018\u0002X\u0082\u0004R\r\u0010Õ\u0001\u001a\u00030Ñ\u00018\u0002X\u0082\u0004R\u0019\u0010×\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0Ö\u00018\u0002X\u0082\u0004R\u0019\u0010Ø\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0Ö\u00018\u0002X\u0082\u0004R\u0019\u0010Ù\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0Ö\u00018\u0002X\u0082\u0004R\u0015\u0010Ú\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0Ö\u00018\u0002X\u0082\u0004R\u0015\u0010Û\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0Ö\u00018\u0002X\u0082\u0004¨\u0006Ü\u0001"}, d2 = {"Llu/e;", "E", "Llu/g;", "", "capacity", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(ILkotlin/jvm/functions/Function1;)V", "element", "P0", "(Ljava/lang/Object;Lmt/b;)Ljava/lang/Object;", "Llu/m;", "segment", "index", "", "s", "j1", "(Llu/m;ILjava/lang/Object;JLmt/b;)Ljava/lang/Object;", "Lju/k3;", "W0", "(Lju/k3;Llu/m;I)V", "Lju/n;", "cont", "Q0", "(Ljava/lang/Object;Lju/n;)V", "", "waiter", "", "closed", "s1", "(Llu/m;ILjava/lang/Object;JLjava/lang/Object;Z)I", "t1", "curSendersAndCloseStatus", "k1", "(J)Z", "curSenders", "S", "l1", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "r", "c1", "(Llu/m;IJLmt/b;)Ljava/lang/Object;", "V0", "N0", "(Lju/n;)V", "Llu/k;", "b1", "M0", "q1", "(Llu/m;IJLjava/lang/Object;)Ljava/lang/Object;", "r1", "m1", "(Ljava/lang/Object;Llu/m;I)Z", "b0", "()V", j6.b.f21518e, "o1", "(Llu/m;IJ)Z", "p1", "nAttempts", "v0", "(J)V", "Lsu/l;", "select", "ignoredParam", "d1", "(Lsu/l;Ljava/lang/Object;)V", "O0", "(Lsu/l;)V", "selectResult", "X0", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Y0", "x0", "H0", "G0", "F0", "Z", "sendersCur", "Y", "(J)Llu/m;", "X", "V", "()Llu/m;", "lastSegment", "E0", "(Llu/m;)J", "e1", "(Llu/m;)V", "sendersCounter", "U", "(Llu/m;J)V", "f1", "(Lju/k3;)V", "g1", "receiver", "h1", "(Lju/k3;Z)V", "sendersAndCloseStatusCur", "isClosedForReceive", "z0", "(JZ)Z", "globalIndex", "y0", "id", "startFrom", "e0", "(JLlu/m;)Llu/m;", "d0", "currentBufferEndCounter", "c0", "(JLlu/m;J)Llu/m;", "I0", "(JLlu/m;)V", "value", "v1", "u1", "Lkotlin/reflect/KFunction3;", "", "Lkotlin/coroutines/CoroutineContext;", "R", "(Lkotlin/jvm/functions/Function1;)Lgu/g;", "cause", "context", "J0", "(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", "Lkotlin/Function3;", "P", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lyt/n;", "O", "K0", "v", "(Ljava/lang/Object;)Ljava/lang/Object;", "n1", "S0", "R0", "C", "(Lmt/b;)Ljava/lang/Object;", "h", "A", "()Ljava/lang/Object;", "globalCellIndex", "a0", "w1", "Llu/i;", "iterator", "()Llu/i;", "L0", "D", "(Ljava/lang/Throwable;)Z", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "c", "(Ljava/util/concurrent/CancellationException;)V", "T", "cancel", "W", "(Ljava/lang/Throwable;Z)Z", "handler", "(Lkotlin/jvm/functions/Function1;)V", "u0", "()Z", "", "toString", "()Ljava/lang/String;", ve.a.f33391e, "I", "Lkotlin/jvm/functions/Function1;", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "Lyt/n;", "getOnUndeliveredElementReceiveCancellationConstructor$annotations", "onUndeliveredElementReceiveCancellationConstructor", "g0", "()J", "bufferEndCounter", "D0", "isRendezvousOrUnlimited", "l0", "()Ljava/lang/Throwable;", "receiveException", "B0", "isClosedForSend0", "A0", "isClosedForReceive0", "s0", "o0", "receiversCounter", "Lsu/h;", "y", "()Lsu/h;", "getOnReceive$annotations", "onReceive", "z", "getOnReceiveCatching$annotations", "onReceiveCatching", "i0", "closeCause", "p0", "sendException", "C0", "isConflatedDropOldest", "K", "isClosedForSend$annotations", "isClosedForSend", "i", "isClosedForReceive$annotations", "Lkotlinx/atomicfu/AtomicLong;", "sendersAndCloseStatus", "receivers", "bufferEnd", "completedExpandBuffersAndPauseFlag", "Lkotlinx/atomicfu/AtomicRef;", "sendSegment", "receiveSegment", "bufferEndSegment", "_closeCause", "closeHandler", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public class e<E> implements lu.g<E> {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f23856d = AtomicLongFieldUpdater.newUpdater(e.class, "sendersAndCloseStatus$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f23857e = AtomicLongFieldUpdater.newUpdater(e.class, "receivers$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f23858f = AtomicLongFieldUpdater.newUpdater(e.class, "bufferEnd$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f23859g = AtomicLongFieldUpdater.newUpdater(e.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f23860h = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "sendSegment$volatile");

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f23861i = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "receiveSegment$volatile");

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f23862j = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "bufferEndSegment$volatile");

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f23863k = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_closeCause$volatile");

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f23864l = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int capacity;

    /* renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final Function1<E, Unit> onUndeliveredElement;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final yt.n<su.l<?>, Object, Object, yt.n<Throwable, Object, CoroutineContext, Unit>> onUndeliveredElementReceiveCancellationConstructor;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0096B¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\r\u001a\u00020\f2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J.\u0010\u001b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001d\u0010\u0015R\u0018\u0010 \u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001fR\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Llu/e$a;", "Llu/i;", "Lju/k3;", "<init>", "(Llu/e;)V", "", ve.a.f33391e, "(Lmt/b;)Ljava/lang/Object;", "Lpu/b0;", "segment", "", "index", "", "c", "(Lpu/b0;I)V", "next", "()Ljava/lang/Object;", "element", "i", "(Ljava/lang/Object;)Z", "j", "()V", "g", "()Z", "Llu/m;", "", "r", "f", "(Llu/m;IJLmt/b;)Ljava/lang/Object;", "h", "", "Ljava/lang/Object;", "receiveResult", "Lju/p;", j6.b.f21518e, "Lju/p;", "continuation", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a implements lu.i<E>, k3 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Object receiveResult;

        /* renamed from: b, reason: from kotlin metadata */
        @Nullable
        public ju.p<? super Boolean> continuation;

        public a() {
            e0 e0Var;
            e0Var = lu.f.f23897p;
            this.receiveResult = e0Var;
        }

        @Override // lu.i
        @Nullable
        public Object a(@NotNull mt.b<? super Boolean> bVar) {
            e0 e0Var;
            m<E> mVar;
            e0 e0Var2;
            e0 e0Var3;
            e0 e0Var4;
            Object obj = this.receiveResult;
            e0Var = lu.f.f23897p;
            boolean z10 = true;
            if (obj == e0Var || this.receiveResult == lu.f.z()) {
                e<E> eVar = e.this;
                m<E> mVar2 = (m) e.m0().get(eVar);
                while (!eVar.i()) {
                    long andIncrement = e.n0().getAndIncrement(eVar);
                    int i10 = lu.f.b;
                    long j10 = andIncrement / i10;
                    int i11 = (int) (andIncrement % i10);
                    if (mVar2.id != j10) {
                        mVar = eVar.d0(j10, mVar2);
                        if (mVar == null) {
                            continue;
                        }
                    } else {
                        mVar = mVar2;
                    }
                    Object q12 = eVar.q1(mVar, i11, andIncrement, null);
                    e0Var2 = lu.f.f23894m;
                    if (q12 == e0Var2) {
                        throw new IllegalStateException("unreachable");
                    }
                    e0Var3 = lu.f.f23896o;
                    if (q12 != e0Var3) {
                        e0Var4 = lu.f.f23895n;
                        if (q12 == e0Var4) {
                            return f(mVar, i11, andIncrement, bVar);
                        }
                        mVar.b();
                        this.receiveResult = q12;
                        return ot.b.a(z10);
                    }
                    if (andIncrement < eVar.s0()) {
                        mVar.b();
                    }
                    mVar2 = mVar;
                }
                z10 = g();
            }
            return ot.b.a(z10);
        }

        @Override // ju.k3
        public void c(@NotNull b0<?> segment, int index) {
            ju.p<? super Boolean> pVar = this.continuation;
            if (pVar != null) {
                pVar.c(segment, index);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:42:0x00a4, code lost:
        
            if (r12 != null) goto L39;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object f(lu.m<E> r10, int r11, long r12, mt.b<? super java.lang.Boolean> r14) {
            /*
                r9 = this;
                lu.e<E> r0 = lu.e.this
                mt.b r1 = nt.b.c(r14)
                ju.p r6 = ju.r.b(r1)
                d(r9, r6)     // Catch: java.lang.Throwable -> Ld6
                r5 = r9
                r1 = r10
                r2 = r11
                r3 = r12
                java.lang.Object r10 = lu.e.M(r0, r1, r2, r3, r5)     // Catch: java.lang.Throwable -> L20
                pu.e0 r11 = lu.f.r()     // Catch: java.lang.Throwable -> L20
                if (r10 != r11) goto L24
                lu.e.F(r0, r9, r1, r2)     // Catch: java.lang.Throwable -> L20
                goto Lc8
            L20:
                r0 = move-exception
            L21:
                r10 = r0
                goto Lda
            L24:
                pu.e0 r11 = lu.f.h()     // Catch: java.lang.Throwable -> L20
                r12 = 1
                r13 = 0
                if (r10 != r11) goto Lb3
                long r10 = r0.s0()     // Catch: java.lang.Throwable -> L20
                int r10 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
                if (r10 >= 0) goto L37
                r1.b()     // Catch: java.lang.Throwable -> L20
            L37:
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r10 = lu.e.n()     // Catch: java.lang.Throwable -> L20
                java.lang.Object r10 = r10.get(r0)     // Catch: java.lang.Throwable -> L20
                lu.m r10 = (lu.m) r10     // Catch: java.lang.Throwable -> L20
            L41:
                boolean r11 = r0.i()     // Catch: java.lang.Throwable -> L20
                if (r11 == 0) goto L4c
                b(r9)     // Catch: java.lang.Throwable -> L20
                goto Lc8
            L4c:
                java.util.concurrent.atomic.AtomicLongFieldUpdater r11 = lu.e.o()     // Catch: java.lang.Throwable -> L20
                long r3 = r11.getAndIncrement(r0)     // Catch: java.lang.Throwable -> L20
                int r11 = lu.f.b     // Catch: java.lang.Throwable -> L20
                long r1 = (long) r11     // Catch: java.lang.Throwable -> L20
                long r1 = r3 / r1
                long r7 = (long) r11     // Catch: java.lang.Throwable -> L20
                long r7 = r3 % r7
                int r11 = (int) r7     // Catch: java.lang.Throwable -> L20
                long r7 = r10.id     // Catch: java.lang.Throwable -> L20
                int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
                if (r7 == 0) goto L6c
                lu.m r1 = lu.e.k(r0, r1, r10)     // Catch: java.lang.Throwable -> L20
                if (r1 != 0) goto L6a
                goto L41
            L6a:
                r2 = r11
                goto L6e
            L6c:
                r1 = r10
                goto L6a
            L6e:
                java.lang.Object r10 = lu.e.M(r0, r1, r2, r3, r5)     // Catch: java.lang.Throwable -> L20
                pu.e0 r11 = lu.f.r()     // Catch: java.lang.Throwable -> L20
                if (r10 != r11) goto L7c
                lu.e.F(r0, r9, r1, r2)     // Catch: java.lang.Throwable -> L20
                goto Lc8
            L7c:
                pu.e0 r11 = lu.f.h()     // Catch: java.lang.Throwable -> L20
                if (r10 != r11) goto L8f
                long r10 = r0.s0()     // Catch: java.lang.Throwable -> L20
                int r10 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
                if (r10 >= 0) goto L8d
                r1.b()     // Catch: java.lang.Throwable -> L20
            L8d:
                r10 = r1
                goto L41
            L8f:
                pu.e0 r11 = lu.f.s()     // Catch: java.lang.Throwable -> L20
                if (r10 == r11) goto Lab
                r1.b()     // Catch: java.lang.Throwable -> L20
                e(r9, r10)     // Catch: java.lang.Throwable -> L20
                d(r9, r13)     // Catch: java.lang.Throwable -> L20
                java.lang.Boolean r11 = ot.b.a(r12)     // Catch: java.lang.Throwable -> L20
                kotlin.jvm.functions.Function1<E, kotlin.Unit> r12 = r0.onUndeliveredElement     // Catch: java.lang.Throwable -> L20
                if (r12 == 0) goto Lc5
            La6:
                yt.n r13 = lu.e.g(r0, r12, r10)     // Catch: java.lang.Throwable -> L20
                goto Lc5
            Lab:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L20
                java.lang.String r11 = "unexpected"
                r10.<init>(r11)     // Catch: java.lang.Throwable -> L20
                throw r10     // Catch: java.lang.Throwable -> L20
            Lb3:
                r1.b()     // Catch: java.lang.Throwable -> L20
                e(r9, r10)     // Catch: java.lang.Throwable -> L20
                d(r9, r13)     // Catch: java.lang.Throwable -> L20
                java.lang.Boolean r11 = ot.b.a(r12)     // Catch: java.lang.Throwable -> L20
                kotlin.jvm.functions.Function1<E, kotlin.Unit> r12 = r0.onUndeliveredElement     // Catch: java.lang.Throwable -> L20
                if (r12 == 0) goto Lc5
                goto La6
            Lc5:
                r6.J(r11, r13)     // Catch: java.lang.Throwable -> L20
            Lc8:
                java.lang.Object r10 = r6.z()
                java.lang.Object r11 = nt.c.e()
                if (r10 != r11) goto Ld5
                ot.h.c(r14)
            Ld5:
                return r10
            Ld6:
                r0 = move-exception
                r5 = r9
                goto L21
            Lda:
                r6.Q()
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: lu.e.a.f(lu.m, int, long, mt.b):java.lang.Object");
        }

        public final boolean g() {
            this.receiveResult = lu.f.z();
            Throwable i02 = e.this.i0();
            if (i02 == null) {
                return false;
            }
            throw d0.a(i02);
        }

        public final void h() {
            ju.p<? super Boolean> pVar = this.continuation;
            Intrinsics.checkNotNull(pVar);
            this.continuation = null;
            this.receiveResult = lu.f.z();
            Throwable i02 = e.this.i0();
            if (i02 == null) {
                n.Companion companion = gt.n.INSTANCE;
                pVar.resumeWith(gt.n.b(Boolean.FALSE));
            } else {
                n.Companion companion2 = gt.n.INSTANCE;
                pVar.resumeWith(gt.n.b(gt.o.a(i02)));
            }
        }

        public final boolean i(E element) {
            boolean B;
            ju.p<? super Boolean> pVar = this.continuation;
            Intrinsics.checkNotNull(pVar);
            this.continuation = null;
            this.receiveResult = element;
            Boolean bool = Boolean.TRUE;
            e<E> eVar = e.this;
            Function1<E, Unit> function1 = eVar.onUndeliveredElement;
            B = lu.f.B(pVar, bool, function1 != null ? eVar.P(function1, element) : null);
            return B;
        }

        public final void j() {
            ju.p<? super Boolean> pVar = this.continuation;
            Intrinsics.checkNotNull(pVar);
            this.continuation = null;
            this.receiveResult = lu.f.z();
            Throwable i02 = e.this.i0();
            if (i02 == null) {
                n.Companion companion = gt.n.INSTANCE;
                pVar.resumeWith(gt.n.b(Boolean.FALSE));
            } else {
                n.Companion companion2 = gt.n.INSTANCE;
                pVar.resumeWith(gt.n.b(gt.o.a(i02)));
            }
        }

        @Override // lu.i
        public E next() {
            e0 e0Var;
            e0 e0Var2;
            E e10 = (E) this.receiveResult;
            e0Var = lu.f.f23897p;
            if (e10 == e0Var) {
                throw new IllegalStateException("`hasNext()` has not been invoked");
            }
            e0Var2 = lu.f.f23897p;
            this.receiveResult = e0Var2;
            if (e10 != lu.f.z()) {
                return e10;
            }
            throw d0.a(e.this.l0());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Llu/e$b;", "Lju/k3;", "Lju/n;", "", "cont", "Lju/n;", ve.a.f33391e, "()Lju/n;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements k3 {
        @NotNull
        public final ju.n<Boolean> a() {
            throw null;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class c extends kotlin.jvm.internal.k implements yt.n<Throwable, E, CoroutineContext, Unit> {
        public c(Object obj) {
            super(3, obj, e.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }

        public final void d(Throwable th2, E e10, CoroutineContext coroutineContext) {
            ((e) this.receiver).K0(th2, e10, coroutineContext);
        }

        @Override // yt.n
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2, Object obj, CoroutineContext coroutineContext) {
            d(th2, obj, coroutineContext);
            return Unit.f22894a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class d extends kotlin.jvm.internal.k implements yt.n<Throwable, k<? extends E>, CoroutineContext, Unit> {
        public d(Object obj) {
            super(3, obj, e.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }

        public final void d(Throwable th2, Object obj, CoroutineContext coroutineContext) {
            ((e) this.receiver).J0(th2, obj, coroutineContext);
        }

        @Override // yt.n
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2, Object obj, CoroutineContext coroutineContext) {
            d(th2, ((k) obj).getHolder(), coroutineContext);
            return Unit.f22894a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: lu.e$e, reason: collision with other inner class name */
    public /* synthetic */ class C0418e extends kotlin.jvm.internal.k implements yt.n<e<?>, su.l<?>, Object, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final C0418e f23869a = new C0418e();

        public C0418e() {
            super(3, e.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        public final void d(e<?> eVar, su.l<?> lVar, Object obj) {
            eVar.d1(lVar, obj);
        }

        @Override // yt.n
        public /* bridge */ /* synthetic */ Unit invoke(e<?> eVar, su.l<?> lVar, Object obj) {
            d(eVar, lVar, obj);
            return Unit.f22894a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class f extends kotlin.jvm.internal.k implements yt.n<e<?>, Object, Object, Object> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f23870a = new f();

        public f() {
            super(3, e.class, "processResultSelectReceive", "processResultSelectReceive(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // yt.n
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(e<?> eVar, Object obj, Object obj2) {
            return eVar.X0(obj, obj2);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class g extends kotlin.jvm.internal.k implements yt.n<e<?>, su.l<?>, Object, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final g f23871a = new g();

        public g() {
            super(3, e.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        public final void d(e<?> eVar, su.l<?> lVar, Object obj) {
            eVar.d1(lVar, obj);
        }

        @Override // yt.n
        public /* bridge */ /* synthetic */ Unit invoke(e<?> eVar, su.l<?> lVar, Object obj) {
            d(eVar, lVar, obj);
            return Unit.f22894a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class h extends kotlin.jvm.internal.k implements yt.n<e<?>, Object, Object, Object> {

        /* renamed from: a, reason: collision with root package name */
        public static final h f23872a = new h();

        public h() {
            super(3, e.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // yt.n
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(e<?> eVar, Object obj, Object obj2) {
            return eVar.Y0(obj, obj2);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @ot.f(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", l = {759}, m = "receiveCatching-JP2dKIU$suspendImpl")
    public static final class i<E> extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f23873t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ e<E> f23874u;

        /* renamed from: v, reason: collision with root package name */
        public int f23875v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(e<E> eVar, mt.b<? super i> bVar) {
            super(bVar);
            this.f23874u = eVar;
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f23873t = obj;
            this.f23875v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            Object a12 = e.a1(this.f23874u, this);
            return a12 == nt.c.e() ? a12 : k.b(a12);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @ot.f(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", l = {3117}, m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk")
    public static final class j extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f23876t;

        /* renamed from: u, reason: collision with root package name */
        public Object f23877u;

        /* renamed from: v, reason: collision with root package name */
        public int f23878v;

        /* renamed from: w, reason: collision with root package name */
        public long f23879w;

        /* renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f23880x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ e<E> f23881y;

        /* renamed from: z, reason: collision with root package name */
        public int f23882z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(e<E> eVar, mt.b<? super j> bVar) {
            super(bVar);
            this.f23881y = eVar;
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f23880x = obj;
            this.f23882z |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            Object b12 = this.f23881y.b1(null, 0, 0L, this);
            return b12 == nt.c.e() ? b12 : k.b(b12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(int i10, @Nullable Function1<? super E, Unit> function1) {
        long A;
        e0 e0Var;
        this.capacity = i10;
        this.onUndeliveredElement = function1;
        if (i10 < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i10 + ", should be >=0").toString());
        }
        A = lu.f.A(i10);
        this.bufferEnd$volatile = A;
        this.completedExpandBuffersAndPauseFlag$volatile = g0();
        m mVar = new m(0L, null, this, 3);
        this.sendSegment$volatile = mVar;
        this.receiveSegment$volatile = mVar;
        if (D0()) {
            mVar = lu.f.f23883a;
            Intrinsics.d(mVar, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = mVar;
        this.onUndeliveredElementReceiveCancellationConstructor = function1 != 0 ? new yt.n() { // from class: lu.b
            @Override // yt.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                yt.n T0;
                T0 = e.T0(e.this, (su.l) obj, obj2, obj3);
                return T0;
            }
        } : null;
        e0Var = lu.f.f23900s;
        this._closeCause$volatile = e0Var;
    }

    public static final Unit Q(Function1 function1, Object obj, Throwable th2, Object obj2, CoroutineContext coroutineContext) {
        pu.x.a(function1, obj, coroutineContext);
        return Unit.f22894a;
    }

    public static final yt.n T0(final e eVar, final su.l lVar, Object obj, final Object obj2) {
        return new yt.n() { // from class: lu.d
            @Override // yt.n
            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                Unit U0;
                U0 = e.U0(obj2, eVar, lVar, (Throwable) obj3, obj4, (CoroutineContext) obj5);
                return U0;
            }
        };
    }

    public static final Unit U0(Object obj, e eVar, su.l lVar, Throwable th2, Object obj2, CoroutineContext coroutineContext) {
        if (obj != lu.f.z()) {
            pu.x.a(eVar.onUndeliveredElement, obj, lVar.getContext());
        }
        return Unit.f22894a;
    }

    public static /* synthetic */ <E> Object Z0(e<E> eVar, mt.b<? super E> bVar) {
        m<E> mVar;
        e0 e0Var;
        e0 e0Var2;
        e0 e0Var3;
        m<E> mVar2 = (m) m0().get(eVar);
        while (!eVar.i()) {
            long andIncrement = n0().getAndIncrement(eVar);
            int i10 = lu.f.b;
            long j10 = andIncrement / i10;
            int i11 = (int) (andIncrement % i10);
            if (mVar2.id != j10) {
                m<E> d02 = eVar.d0(j10, mVar2);
                if (d02 == null) {
                    continue;
                } else {
                    mVar = d02;
                }
            } else {
                mVar = mVar2;
            }
            e<E> eVar2 = eVar;
            Object q12 = eVar2.q1(mVar, i11, andIncrement, null);
            e0Var = lu.f.f23894m;
            if (q12 == e0Var) {
                throw new IllegalStateException("unexpected");
            }
            e0Var2 = lu.f.f23896o;
            if (q12 != e0Var2) {
                e0Var3 = lu.f.f23895n;
                if (q12 == e0Var3) {
                    return eVar2.c1(mVar, i11, andIncrement, bVar);
                }
                mVar.b();
                return q12;
            }
            if (andIncrement < eVar2.s0()) {
                mVar.b();
            }
            eVar = eVar2;
            mVar2 = mVar;
        }
        throw d0.a(eVar.l0());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r14v12, types: [lu.k$b] */
    /* JADX WARN: Type inference failed for: r7v2, types: [lu.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ <E> java.lang.Object a1(lu.e<E> r13, mt.b<? super lu.k<? extends E>> r14) {
        /*
            boolean r0 = r14 instanceof lu.e.i
            if (r0 == 0) goto L14
            r0 = r14
            lu.e$i r0 = (lu.e.i) r0
            int r1 = r0.f23875v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f23875v = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            lu.e$i r0 = new lu.e$i
            r0.<init>(r13, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.f23873t
            java.lang.Object r0 = nt.c.e()
            int r1 = r6.f23875v
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            gt.o.b(r14)
            lu.k r14 = (lu.k) r14
            java.lang.Object r13 = r14.getHolder()
            return r13
        L31:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L39:
            gt.o.b(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = n()
            java.lang.Object r14 = r14.get(r13)
            lu.m r14 = (lu.m) r14
        L46:
            boolean r1 = r13.i()
            if (r1 == 0) goto L57
            lu.k$b r14 = lu.k.INSTANCE
            java.lang.Throwable r13 = r13.i0()
            java.lang.Object r13 = r14.a(r13)
            return r13
        L57:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = o()
            long r4 = r1.getAndIncrement(r13)
            int r1 = lu.f.b
            long r7 = (long) r1
            long r7 = r4 / r7
            long r9 = (long) r1
            long r9 = r4 % r9
            int r3 = (int) r9
            long r9 = r14.id
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L77
            lu.m r1 = k(r13, r7, r14)
            if (r1 != 0) goto L75
            goto L46
        L75:
            r8 = r1
            goto L78
        L77:
            r8 = r14
        L78:
            r12 = 0
            r7 = r13
            r9 = r3
            r10 = r4
            java.lang.Object r13 = M(r7, r8, r9, r10, r12)
            r1 = r7
            pu.e0 r14 = lu.f.r()
            if (r13 == r14) goto Lb6
            pu.e0 r14 = lu.f.h()
            if (r13 != r14) goto L9b
            long r13 = r1.s0()
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r13 >= 0) goto L98
            r8.b()
        L98:
            r13 = r1
            r14 = r8
            goto L46
        L9b:
            pu.e0 r14 = lu.f.s()
            if (r13 != r14) goto Lac
            r6.f23875v = r2
            r2 = r8
            java.lang.Object r13 = r1.b1(r2, r3, r4, r6)
            if (r13 != r0) goto Lab
            return r0
        Lab:
            return r13
        Lac:
            r8.b()
            lu.k$b r14 = lu.k.INSTANCE
            java.lang.Object r13 = r14.c(r13)
            return r13
        Lb6:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: lu.e.a1(lu.e, mt.b):java.lang.Object");
    }

    public static /* synthetic */ <E> Object i1(e<E> eVar, E e10, mt.b<? super Unit> bVar) {
        m<E> mVar;
        m<E> mVar2 = (m) q0().get(eVar);
        while (true) {
            long andIncrement = r0().getAndIncrement(eVar);
            long j10 = andIncrement & 1152921504606846975L;
            boolean B0 = eVar.B0(andIncrement);
            int i10 = lu.f.b;
            long j11 = j10 / i10;
            int i11 = (int) (j10 % i10);
            if (mVar2.id != j11) {
                m<E> e02 = eVar.e0(j11, mVar2);
                if (e02 != null) {
                    mVar = e02;
                } else if (B0) {
                    Object P0 = eVar.P0(e10, bVar);
                    if (P0 == nt.c.e()) {
                        return P0;
                    }
                }
            } else {
                mVar = mVar2;
            }
            e<E> eVar2 = eVar;
            E e11 = e10;
            int s12 = eVar2.s1(mVar, i11, e11, j10, null, B0);
            if (s12 == 0) {
                mVar.b();
                break;
            }
            if (s12 == 1) {
                break;
            }
            if (s12 != 2) {
                if (s12 == 3) {
                    Object j12 = eVar2.j1(mVar, i11, e11, j10, bVar);
                    if (j12 == nt.c.e()) {
                        return j12;
                    }
                } else if (s12 != 4) {
                    if (s12 == 5) {
                        mVar.b();
                    }
                    eVar = eVar2;
                    mVar2 = mVar;
                    e10 = e11;
                } else {
                    if (j10 < eVar2.o0()) {
                        mVar.b();
                    }
                    Object P02 = eVar2.P0(e11, bVar);
                    if (P02 == nt.c.e()) {
                        return P02;
                    }
                }
            } else if (B0) {
                mVar.t();
                Object P03 = eVar2.P0(e11, bVar);
                if (P03 == nt.c.e()) {
                    return P03;
                }
            }
        }
        return Unit.f22894a;
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater m0() {
        return f23861i;
    }

    public static final /* synthetic */ AtomicLongFieldUpdater n0() {
        return f23857e;
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater q0() {
        return f23860h;
    }

    public static final /* synthetic */ AtomicLongFieldUpdater r0() {
        return f23856d;
    }

    public static /* synthetic */ void w0(e eVar, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i10 & 1) != 0) {
            j10 = 1;
        }
        eVar.v0(j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // lu.x
    @NotNull
    public Object A() {
        Object obj;
        m mVar;
        e0 e0Var;
        e0 e0Var2;
        e0 e0Var3;
        long j10 = f23857e.get(this);
        long j11 = f23856d.get(this);
        if (A0(j11)) {
            return k.INSTANCE.a(i0());
        }
        if (j10 >= (j11 & 1152921504606846975L)) {
            return k.INSTANCE.b();
        }
        obj = lu.f.f23892k;
        m mVar2 = (m) m0().get(this);
        while (!i()) {
            long andIncrement = n0().getAndIncrement(this);
            int i10 = lu.f.b;
            long j12 = andIncrement / i10;
            int i11 = (int) (andIncrement % i10);
            if (mVar2.id != j12) {
                mVar = d0(j12, mVar2);
                if (mVar == null) {
                    continue;
                }
            } else {
                mVar = mVar2;
            }
            Object q12 = q1(mVar, i11, andIncrement, obj);
            e0Var = lu.f.f23894m;
            if (q12 == e0Var) {
                k3 k3Var = obj instanceof k3 ? (k3) obj : null;
                if (k3Var != null) {
                    V0(k3Var, mVar, i11);
                }
                w1(andIncrement);
                mVar.t();
                return k.INSTANCE.b();
            }
            e0Var2 = lu.f.f23896o;
            if (q12 != e0Var2) {
                e0Var3 = lu.f.f23895n;
                if (q12 == e0Var3) {
                    throw new IllegalStateException("unexpected");
                }
                mVar.b();
                return k.INSTANCE.c(q12);
            }
            if (andIncrement < s0()) {
                mVar.b();
            }
            mVar2 = mVar;
        }
        return k.INSTANCE.a(i0());
    }

    public final boolean A0(long j10) {
        return z0(j10, true);
    }

    public final boolean B0(long j10) {
        return z0(j10, false);
    }

    @Override // lu.x
    @Nullable
    public Object C(@NotNull mt.b<? super E> bVar) {
        return Z0(this, bVar);
    }

    public boolean C0() {
        return false;
    }

    @Override // lu.y
    public boolean D(@Nullable Throwable cause) {
        return W(cause, false);
    }

    public final boolean D0() {
        long g02 = g0();
        return g02 == 0 || g02 == Long.MAX_VALUE;
    }

    @Override // lu.y
    @Nullable
    public Object E(E e10, @NotNull mt.b<? super Unit> bVar) {
        return i1(this, e10, bVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        r8 = (lu.m) r8.h();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long E0(lu.m<E> r8) {
        /*
            r7 = this;
        L0:
            int r0 = lu.f.b
            int r0 = r0 + (-1)
        L4:
            r1 = -1
            r3 = -1
            if (r3 >= r0) goto L3c
            long r3 = r8.id
            int r5 = lu.f.b
            long r5 = (long) r5
            long r3 = r3 * r5
            long r5 = (long) r0
            long r3 = r3 + r5
            long r5 = r7.o0()
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L1a
            return r1
        L1a:
            java.lang.Object r1 = r8.B(r0)
            if (r1 == 0) goto L2c
            pu.e0 r2 = lu.f.k()
            if (r1 != r2) goto L27
            goto L2c
        L27:
            pu.e0 r2 = lu.f.f23885d
            if (r1 != r2) goto L39
            return r3
        L2c:
            pu.e0 r2 = lu.f.z()
            boolean r1 = r8.v(r0, r1, r2)
            if (r1 == 0) goto L1a
            r8.t()
        L39:
            int r0 = r0 + (-1)
            goto L4
        L3c:
            pu.c r8 = r8.h()
            lu.m r8 = (lu.m) r8
            if (r8 != 0) goto L0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: lu.e.E0(lu.m):long");
    }

    public final void F0() {
        long j10;
        long w5;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f23856d;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if (((int) (j10 >> 60)) != 0) {
                return;
            } else {
                w5 = lu.f.w(1152921504606846975L & j10, 1);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, w5));
    }

    public final void G0() {
        long j10;
        long w5;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f23856d;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            w5 = lu.f.w(1152921504606846975L & j10, 3);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, w5));
    }

    public final void H0() {
        long j10;
        long w5;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f23856d;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            int i10 = (int) (j10 >> 60);
            if (i10 == 0) {
                w5 = lu.f.w(1152921504606846975L & j10, 2);
            } else if (i10 != 1) {
                return;
            } else {
                w5 = lu.f.w(1152921504606846975L & j10, 3);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, w5));
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0011, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I0(long r5, lu.m<E> r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.id
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            pu.c r0 = r7.f()
            lu.m r0 = (lu.m) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.k()
            if (r5 == 0) goto L22
            pu.c r5 = r7.f()
            lu.m r5 = (lu.m) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = h0()
        L26:
            java.lang.Object r6 = r5.get(r4)
            pu.b0 r6 = (pu.b0) r6
            long r0 = r6.id
            long r2 = r7.id
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L35
            return
        L35:
            boolean r0 = r7.u()
            if (r0 != 0) goto L3c
            goto L11
        L3c:
            boolean r0 = y1.b.a(r5, r4, r6, r7)
            if (r0 == 0) goto L4c
            boolean r5 = r6.p()
            if (r5 == 0) goto L4b
            r6.n()
        L4b:
            return
        L4c:
            boolean r6 = r7.p()
            if (r6 == 0) goto L26
            r7.n()
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: lu.e.I0(long, lu.m):void");
    }

    public final void J0(Throwable cause, Object element, CoroutineContext context) {
        Function1<E, Unit> function1 = this.onUndeliveredElement;
        Intrinsics.checkNotNull(function1);
        Object f10 = k.f(element);
        Intrinsics.checkNotNull(f10);
        pu.x.a(function1, f10, context);
    }

    @Override // lu.y
    public boolean K() {
        return B0(f23856d.get(this));
    }

    public final void K0(Throwable cause, E element, CoroutineContext context) {
        Function1<E, Unit> function1 = this.onUndeliveredElement;
        Intrinsics.checkNotNull(function1);
        pu.x.a(function1, element, context);
    }

    public void L0() {
    }

    public final void M0(ju.n<? super k<? extends E>> cont) {
        n.Companion companion = gt.n.INSTANCE;
        cont.resumeWith(gt.n.b(k.b(k.INSTANCE.a(i0()))));
    }

    public final void N0(ju.n<? super E> cont) {
        n.Companion companion = gt.n.INSTANCE;
        cont.resumeWith(gt.n.b(gt.o.a(l0())));
    }

    public final gu.g<Unit> O(Function1<? super E, Unit> function1) {
        return new c(this);
    }

    public final void O0(su.l<?> select) {
        select.e(lu.f.z());
    }

    public final yt.n<Throwable, Object, CoroutineContext, Unit> P(final Function1<? super E, Unit> function1, final E e10) {
        return new yt.n() { // from class: lu.c
            @Override // yt.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Unit Q;
                Q = e.Q(Function1.this, e10, (Throwable) obj, obj2, (CoroutineContext) obj3);
                return Q;
            }
        };
    }

    public final Object P0(E e10, mt.b<? super Unit> bVar) {
        s0 c10;
        ju.p pVar = new ju.p(nt.b.c(bVar), 1);
        pVar.F();
        Function1<E, Unit> function1 = this.onUndeliveredElement;
        if (function1 == null || (c10 = pu.x.c(function1, e10, null, 2, null)) == null) {
            Throwable p02 = p0();
            n.Companion companion = gt.n.INSTANCE;
            pVar.resumeWith(gt.n.b(gt.o.a(p02)));
        } else {
            gt.a.a(c10, p0());
            n.Companion companion2 = gt.n.INSTANCE;
            pVar.resumeWith(gt.n.b(gt.o.a(c10)));
        }
        Object z10 = pVar.z();
        if (z10 == nt.c.e()) {
            ot.h.c(bVar);
        }
        return z10 == nt.c.e() ? z10 : Unit.f22894a;
    }

    public final void Q0(E element, ju.n<? super Unit> cont) {
        Function1<E, Unit> function1 = this.onUndeliveredElement;
        if (function1 != null) {
            pu.x.a(function1, element, cont.getContext());
        }
        Throwable p02 = p0();
        n.Companion companion = gt.n.INSTANCE;
        cont.resumeWith(gt.n.b(gt.o.a(p02)));
    }

    public final gu.g<Unit> R(Function1<? super E, Unit> function1) {
        return new d(this);
    }

    public void R0() {
    }

    public final boolean S(long curSenders) {
        return curSenders < g0() || curSenders < o0() + ((long) this.capacity);
    }

    public void S0() {
    }

    public boolean T(@Nullable Throwable cause) {
        if (cause == null) {
            cause = new CancellationException("Channel was cancelled");
        }
        return W(cause, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void U(m<E> lastSegment, long sendersCounter) {
        e0 e0Var;
        Object b10 = pu.k.b(null, 1, null);
        loop0: while (lastSegment != null) {
            for (int i10 = lu.f.b - 1; -1 < i10; i10--) {
                if ((lastSegment.id * lu.f.b) + i10 < sendersCounter) {
                    break loop0;
                }
                while (true) {
                    Object B = lastSegment.B(i10);
                    if (B != null) {
                        e0Var = lu.f.f23886e;
                        if (B != e0Var) {
                            if (!(B instanceof WaiterEB)) {
                                if (!(B instanceof k3)) {
                                    break;
                                }
                                if (lastSegment.v(i10, B, lu.f.z())) {
                                    b10 = pu.k.c(b10, B);
                                    lastSegment.C(i10, true);
                                    break;
                                }
                            } else {
                                if (lastSegment.v(i10, B, lu.f.z())) {
                                    b10 = pu.k.c(b10, ((WaiterEB) B).waiter);
                                    lastSegment.C(i10, true);
                                    break;
                                }
                            }
                        }
                    }
                    if (lastSegment.v(i10, B, lu.f.z())) {
                        lastSegment.t();
                        break;
                    }
                }
            }
            lastSegment = (m) lastSegment.h();
        }
        if (b10 != null) {
            if (!(b10 instanceof ArrayList)) {
                f1((k3) b10);
                return;
            }
            Intrinsics.d(b10, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
            ArrayList arrayList = (ArrayList) b10;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                f1((k3) arrayList.get(size));
            }
        }
    }

    public final m<E> V() {
        Object obj = f23862j.get(this);
        m mVar = (m) f23860h.get(this);
        if (mVar.id > ((m) obj).id) {
            obj = mVar;
        }
        m mVar2 = (m) f23861i.get(this);
        if (mVar2.id > ((m) obj).id) {
            obj = mVar2;
        }
        return (m) pu.b.b((pu.c) obj);
    }

    public final void V0(k3 k3Var, m<E> mVar, int i10) {
        S0();
        k3Var.c(mVar, i10);
    }

    public boolean W(@Nullable Throwable cause, boolean cancel) {
        e0 e0Var;
        if (cancel) {
            F0();
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23863k;
        e0Var = lu.f.f23900s;
        boolean a10 = y1.b.a(atomicReferenceFieldUpdater, this, e0Var, cause);
        if (cancel) {
            G0();
        } else {
            H0();
        }
        Z();
        L0();
        if (a10) {
            x0();
        }
        return a10;
    }

    public final void W0(k3 k3Var, m<E> mVar, int i10) {
        k3Var.c(mVar, i10 + lu.f.b);
    }

    public final void X(long sendersCur) {
        e1(Y(sendersCur));
    }

    public final Object X0(Object ignoredParam, Object selectResult) {
        if (selectResult != lu.f.z()) {
            return selectResult;
        }
        throw l0();
    }

    public final m<E> Y(long sendersCur) {
        m<E> V = V();
        if (C0()) {
            long E0 = E0(V);
            if (E0 != -1) {
                a0(E0);
            }
        }
        U(V, sendersCur);
        return V;
    }

    public final Object Y0(Object ignoredParam, Object selectResult) {
        return k.b(selectResult == lu.f.z() ? k.INSTANCE.a(i0()) : k.INSTANCE.c(selectResult));
    }

    public final void Z() {
        K();
    }

    public final void a0(long globalCellIndex) {
        m<E> mVar;
        e0 e0Var;
        s0 c10;
        m<E> mVar2 = (m) f23861i.get(this);
        while (true) {
            long j10 = f23857e.get(this);
            if (globalCellIndex < Math.max(this.capacity + j10, g0())) {
                return;
            }
            if (f23857e.compareAndSet(this, j10, 1 + j10)) {
                int i10 = lu.f.b;
                long j11 = j10 / i10;
                int i11 = (int) (j10 % i10);
                if (mVar2.id != j11) {
                    mVar = d0(j11, mVar2);
                    if (mVar == null) {
                        continue;
                    }
                } else {
                    mVar = mVar2;
                }
                Object q12 = q1(mVar, i11, j10, null);
                e0Var = lu.f.f23896o;
                if (q12 != e0Var) {
                    mVar.b();
                    Function1<E, Unit> function1 = this.onUndeliveredElement;
                    if (function1 != null && (c10 = pu.x.c(function1, q12, null, 2, null)) != null) {
                        throw c10;
                    }
                } else if (j10 < s0()) {
                    mVar.b();
                }
                mVar2 = mVar;
            }
        }
    }

    public final void b0() {
        if (D0()) {
            return;
        }
        m<E> mVar = (m) f23862j.get(this);
        while (true) {
            long andIncrement = f23858f.getAndIncrement(this);
            int i10 = lu.f.b;
            long j10 = andIncrement / i10;
            if (s0() <= andIncrement) {
                if (mVar.id < j10 && mVar.f() != 0) {
                    I0(j10, mVar);
                }
                w0(this, 0L, 1, null);
                return;
            }
            if (mVar.id != j10) {
                m<E> c02 = c0(j10, mVar, andIncrement);
                if (c02 == null) {
                    continue;
                } else {
                    mVar = c02;
                }
            }
            if (o1(mVar, (int) (andIncrement % i10), andIncrement)) {
                w0(this, 0L, 1, null);
                return;
            }
            w0(this, 0L, 1, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b1(lu.m<E> r11, int r12, long r13, mt.b<? super lu.k<? extends E>> r15) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lu.e.b1(lu.m, int, long, mt.b):java.lang.Object");
    }

    @Override // lu.x
    public final void c(@Nullable CancellationException cause) {
        T(cause);
    }

    public final m<E> c0(long id2, m<E> startFrom, long currentBufferEndCounter) {
        Object c10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23862j;
        Function2 function2 = (Function2) lu.f.y();
        loop0: while (true) {
            c10 = pu.b.c(startFrom, id2, function2);
            if (!c0.c(c10)) {
                b0 b10 = c0.b(c10);
                while (true) {
                    b0 b0Var = (b0) atomicReferenceFieldUpdater.get(this);
                    if (b0Var.id >= b10.id) {
                        break loop0;
                    }
                    if (!b10.u()) {
                        break;
                    }
                    if (y1.b.a(atomicReferenceFieldUpdater, this, b0Var, b10)) {
                        if (b0Var.p()) {
                            b0Var.n();
                        }
                    } else if (b10.p()) {
                        b10.n();
                    }
                }
            } else {
                break;
            }
        }
        if (c0.c(c10)) {
            Z();
            I0(id2, startFrom);
            w0(this, 0L, 1, null);
            return null;
        }
        m<E> mVar = (m) c0.b(c10);
        if (mVar.id <= id2) {
            return mVar;
        }
        long j10 = mVar.id;
        int i10 = lu.f.b;
        if (f23858f.compareAndSet(this, currentBufferEndCounter + 1, j10 * i10)) {
            v0((mVar.id * i10) - currentBufferEndCounter);
        } else {
            w0(this, 0L, 1, null);
        }
        return null;
    }

    public final Object c1(m<E> mVar, int i10, long j10, mt.b<? super E> bVar) {
        e0 e0Var;
        e0 e0Var2;
        m mVar2;
        e0 e0Var3;
        e0 e0Var4;
        e0 e0Var5;
        ju.p b10 = ju.r.b(nt.b.c(bVar));
        try {
            Object q12 = q1(mVar, i10, j10, b10);
            e0Var = lu.f.f23894m;
            if (q12 == e0Var) {
                V0(b10, mVar, i10);
            } else {
                e0Var2 = lu.f.f23896o;
                gu.g gVar = null;
                gVar = null;
                if (q12 == e0Var2) {
                    if (j10 < s0()) {
                        mVar.b();
                    }
                    m mVar3 = (m) m0().get(this);
                    while (true) {
                        if (i()) {
                            N0(b10);
                            break;
                        }
                        long andIncrement = n0().getAndIncrement(this);
                        int i11 = lu.f.b;
                        long j11 = andIncrement / i11;
                        int i12 = (int) (andIncrement % i11);
                        if (mVar3.id != j11) {
                            m d02 = d0(j11, mVar3);
                            if (d02 != null) {
                                mVar2 = d02;
                            }
                        } else {
                            mVar2 = mVar3;
                        }
                        q12 = q1(mVar2, i12, andIncrement, b10);
                        m mVar4 = mVar2;
                        e0Var3 = lu.f.f23894m;
                        if (q12 == e0Var3) {
                            ju.p pVar = b10 != null ? b10 : null;
                            if (pVar != null) {
                                V0(pVar, mVar4, i12);
                            }
                        } else {
                            e0Var4 = lu.f.f23896o;
                            if (q12 == e0Var4) {
                                if (andIncrement < s0()) {
                                    mVar4.b();
                                }
                                mVar3 = mVar4;
                            } else {
                                e0Var5 = lu.f.f23895n;
                                if (q12 == e0Var5) {
                                    throw new IllegalStateException("unexpected");
                                }
                                mVar4.b();
                                Function1<E, Unit> function1 = this.onUndeliveredElement;
                                if (function1 != null) {
                                    gVar = O(function1);
                                }
                            }
                        }
                    }
                } else {
                    mVar.b();
                    Function1<E, Unit> function12 = this.onUndeliveredElement;
                    if (function12 != null) {
                        gVar = O(function12);
                    }
                }
                b10.J(q12, (yt.n) gVar);
            }
            Object z10 = b10.z();
            if (z10 == nt.c.e()) {
                ot.h.c(bVar);
            }
            return z10;
        } catch (Throwable th2) {
            b10.Q();
            throw th2;
        }
    }

    public final m<E> d0(long id2, m<E> startFrom) {
        Object c10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23861i;
        Function2 function2 = (Function2) lu.f.y();
        loop0: while (true) {
            c10 = pu.b.c(startFrom, id2, function2);
            if (!c0.c(c10)) {
                b0 b10 = c0.b(c10);
                while (true) {
                    b0 b0Var = (b0) atomicReferenceFieldUpdater.get(this);
                    if (b0Var.id >= b10.id) {
                        break loop0;
                    }
                    if (!b10.u()) {
                        break;
                    }
                    if (y1.b.a(atomicReferenceFieldUpdater, this, b0Var, b10)) {
                        if (b0Var.p()) {
                            b0Var.n();
                        }
                    } else if (b10.p()) {
                        b10.n();
                    }
                }
            } else {
                break;
            }
        }
        if (c0.c(c10)) {
            Z();
            if (startFrom.id * lu.f.b < s0()) {
                startFrom.b();
            }
            return null;
        }
        m<E> mVar = (m) c0.b(c10);
        if (!D0() && id2 <= g0() / lu.f.b) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f23862j;
            while (true) {
                b0 b0Var2 = (b0) atomicReferenceFieldUpdater2.get(this);
                if (b0Var2.id >= mVar.id || !mVar.u()) {
                    break;
                }
                if (y1.b.a(atomicReferenceFieldUpdater2, this, b0Var2, mVar)) {
                    if (b0Var2.p()) {
                        b0Var2.n();
                    }
                } else if (mVar.p()) {
                    mVar.n();
                }
            }
        }
        long j10 = mVar.id;
        if (j10 <= id2) {
            return mVar;
        }
        int i10 = lu.f.b;
        u1(j10 * i10);
        if (mVar.id * i10 < s0()) {
            mVar.b();
        }
        return null;
    }

    public final void d1(su.l<?> select, Object ignoredParam) {
        m mVar;
        e0 e0Var;
        e0 e0Var2;
        e0 e0Var3;
        m mVar2 = (m) m0().get(this);
        while (!i()) {
            long andIncrement = n0().getAndIncrement(this);
            int i10 = lu.f.b;
            long j10 = andIncrement / i10;
            int i11 = (int) (andIncrement % i10);
            if (mVar2.id != j10) {
                m d02 = d0(j10, mVar2);
                if (d02 == null) {
                    continue;
                } else {
                    mVar = d02;
                }
            } else {
                mVar = mVar2;
            }
            su.l<?> lVar = select;
            Object q12 = q1(mVar, i11, andIncrement, lVar);
            mVar2 = mVar;
            e0Var = lu.f.f23894m;
            if (q12 == e0Var) {
                k3 k3Var = lVar instanceof k3 ? (k3) lVar : null;
                if (k3Var != null) {
                    V0(k3Var, mVar2, i11);
                    return;
                }
                return;
            }
            e0Var2 = lu.f.f23896o;
            if (q12 != e0Var2) {
                e0Var3 = lu.f.f23895n;
                if (q12 == e0Var3) {
                    throw new IllegalStateException("unexpected");
                }
                mVar2.b();
                lVar.e(q12);
                return;
            }
            if (andIncrement < s0()) {
                mVar2.b();
            }
            select = lVar;
        }
        O0(select);
    }

    public final m<E> e0(long id2, m<E> startFrom) {
        Object c10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23860h;
        Function2 function2 = (Function2) lu.f.y();
        loop0: while (true) {
            c10 = pu.b.c(startFrom, id2, function2);
            if (!c0.c(c10)) {
                b0 b10 = c0.b(c10);
                while (true) {
                    b0 b0Var = (b0) atomicReferenceFieldUpdater.get(this);
                    if (b0Var.id >= b10.id) {
                        break loop0;
                    }
                    if (!b10.u()) {
                        break;
                    }
                    if (y1.b.a(atomicReferenceFieldUpdater, this, b0Var, b10)) {
                        if (b0Var.p()) {
                            b0Var.n();
                        }
                    } else if (b10.p()) {
                        b10.n();
                    }
                }
            } else {
                break;
            }
        }
        if (c0.c(c10)) {
            Z();
            if (startFrom.id * lu.f.b < o0()) {
                startFrom.b();
            }
            return null;
        }
        m<E> mVar = (m) c0.b(c10);
        long j10 = mVar.id;
        if (j10 <= id2) {
            return mVar;
        }
        int i10 = lu.f.b;
        v1(j10 * i10);
        if (mVar.id * i10 < o0()) {
            mVar.b();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x00b3, code lost:
    
        r12 = (lu.m) r12.h();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e1(lu.m<E> r12) {
        /*
            r11 = this;
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r0 = r11.onUndeliveredElement
            r1 = 0
            r2 = 1
            java.lang.Object r3 = pu.k.b(r1, r2, r1)
        L8:
            int r4 = lu.f.b
            int r4 = r4 - r2
        Lb:
            r5 = -1
            if (r5 >= r4) goto Lb3
            long r6 = r12.id
            int r8 = lu.f.b
            long r8 = (long) r8
            long r6 = r6 * r8
            long r8 = (long) r4
            long r6 = r6 + r8
        L16:
            java.lang.Object r8 = r12.B(r4)
            pu.e0 r9 = lu.f.f()
            if (r8 == r9) goto Lbb
            pu.e0 r9 = lu.f.f23885d
            if (r8 != r9) goto L48
            long r9 = r11.o0()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto Lbb
            pu.e0 r9 = lu.f.z()
            boolean r8 = r12.v(r4, r8, r9)
            if (r8 == 0) goto L16
            if (r0 == 0) goto L40
            java.lang.Object r5 = r12.A(r4)
            pu.s0 r1 = pu.x.b(r0, r5, r1)
        L40:
            r12.w(r4)
            r12.t()
            goto Laf
        L48:
            pu.e0 r9 = lu.f.k()
            if (r8 == r9) goto La2
            if (r8 != 0) goto L51
            goto La2
        L51:
            boolean r9 = r8 instanceof ju.k3
            if (r9 != 0) goto L6e
            boolean r9 = r8 instanceof lu.WaiterEB
            if (r9 == 0) goto L5a
            goto L6e
        L5a:
            pu.e0 r9 = lu.f.p()
            if (r8 == r9) goto Lbb
            pu.e0 r9 = lu.f.q()
            if (r8 != r9) goto L67
            goto Lbb
        L67:
            pu.e0 r9 = lu.f.p()
            if (r8 == r9) goto L16
            goto Laf
        L6e:
            long r9 = r11.o0()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto Lbb
            boolean r9 = r8 instanceof lu.WaiterEB
            if (r9 == 0) goto L80
            r9 = r8
            lu.z r9 = (lu.WaiterEB) r9
            ju.k3 r9 = r9.waiter
            goto L83
        L80:
            r9 = r8
            ju.k3 r9 = (ju.k3) r9
        L83:
            pu.e0 r10 = lu.f.z()
            boolean r8 = r12.v(r4, r8, r10)
            if (r8 == 0) goto L16
            if (r0 == 0) goto L97
            java.lang.Object r5 = r12.A(r4)
            pu.s0 r1 = pu.x.b(r0, r5, r1)
        L97:
            java.lang.Object r3 = pu.k.c(r3, r9)
            r12.w(r4)
            r12.t()
            goto Laf
        La2:
            pu.e0 r9 = lu.f.z()
            boolean r8 = r12.v(r4, r8, r9)
            if (r8 == 0) goto L16
            r12.t()
        Laf:
            int r4 = r4 + (-1)
            goto Lb
        Lb3:
            pu.c r12 = r12.h()
            lu.m r12 = (lu.m) r12
            if (r12 != 0) goto L8
        Lbb:
            if (r3 == 0) goto Le1
            boolean r12 = r3 instanceof java.util.ArrayList
            if (r12 != 0) goto Lc7
            ju.k3 r3 = (ju.k3) r3
            r11.g1(r3)
            goto Le1
        Lc7:
            java.lang.String r12 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>"
            kotlin.jvm.internal.Intrinsics.d(r3, r12)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r12 = r3.size()
            int r12 = r12 - r2
        Ld3:
            if (r5 >= r12) goto Le1
            java.lang.Object r0 = r3.get(r12)
            ju.k3 r0 = (ju.k3) r0
            r11.g1(r0)
            int r12 = r12 + (-1)
            goto Ld3
        Le1:
            if (r1 != 0) goto Le4
            return
        Le4:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: lu.e.e1(lu.m):void");
    }

    public final void f1(k3 k3Var) {
        h1(k3Var, true);
    }

    public final long g0() {
        return f23858f.get(this);
    }

    public final void g1(k3 k3Var) {
        h1(k3Var, false);
    }

    @Override // lu.x
    @Nullable
    public Object h(@NotNull mt.b<? super k<? extends E>> bVar) {
        return a1(this, bVar);
    }

    public final void h1(k3 k3Var, boolean z10) {
        if (k3Var instanceof b) {
            ju.n<Boolean> a10 = ((b) k3Var).a();
            n.Companion companion = gt.n.INSTANCE;
            a10.resumeWith(gt.n.b(Boolean.FALSE));
            return;
        }
        if (k3Var instanceof ju.n) {
            mt.b bVar = (mt.b) k3Var;
            n.Companion companion2 = gt.n.INSTANCE;
            bVar.resumeWith(gt.n.b(gt.o.a(z10 ? l0() : p0())));
        } else if (k3Var instanceof w) {
            ju.p<k<? extends E>> pVar = ((w) k3Var).cont;
            n.Companion companion3 = gt.n.INSTANCE;
            pVar.resumeWith(gt.n.b(k.b(k.INSTANCE.a(i0()))));
        } else if (k3Var instanceof a) {
            ((a) k3Var).j();
        } else {
            if (k3Var instanceof su.l) {
                ((su.l) k3Var).f(this, lu.f.z());
                return;
            }
            throw new IllegalStateException(("Unexpected waiter: " + k3Var).toString());
        }
    }

    @Override // lu.x
    public boolean i() {
        return A0(f23856d.get(this));
    }

    @Nullable
    public final Throwable i0() {
        return (Throwable) f23863k.get(this);
    }

    @Override // lu.x
    @NotNull
    public lu.i<E> iterator() {
        return new a();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j1(lu.m<E> r17, int r18, E r19, long r20, mt.b<? super kotlin.Unit> r22) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lu.e.j1(lu.m, int, java.lang.Object, long, mt.b):java.lang.Object");
    }

    public final boolean k1(long curSendersAndCloseStatus) {
        if (B0(curSendersAndCloseStatus)) {
            return false;
        }
        return !S(curSendersAndCloseStatus & 1152921504606846975L);
    }

    public final Throwable l0() {
        Throwable i02 = i0();
        return i02 == null ? new q("Channel was closed") : i02;
    }

    public final boolean l1(Object obj, E e10) {
        boolean B;
        boolean B2;
        if (obj instanceof su.l) {
            return ((su.l) obj).f(this, e10);
        }
        if (obj instanceof w) {
            Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            ju.p<k<? extends E>> pVar = ((w) obj).cont;
            k b10 = k.b(k.INSTANCE.c(e10));
            Function1<E, Unit> function1 = this.onUndeliveredElement;
            B2 = lu.f.B(pVar, b10, (yt.n) (function1 != null ? R(function1) : null));
            return B2;
        }
        if (obj instanceof a) {
            Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((a) obj).i(e10);
        }
        if (!(obj instanceof ju.n)) {
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
        ju.n nVar = (ju.n) obj;
        Function1<E, Unit> function12 = this.onUndeliveredElement;
        B = lu.f.B(nVar, e10, (yt.n) (function12 != null ? O(function12) : null));
        return B;
    }

    public final boolean m1(Object obj, m<E> mVar, int i10) {
        if (obj instanceof ju.n) {
            Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return lu.f.C((ju.n) obj, Unit.f22894a, null, 2, null);
        }
        if (obj instanceof su.l) {
            Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            su.o x10 = ((su.k) obj).x(this, Unit.f22894a);
            if (x10 == su.o.b) {
                mVar.w(i10);
            }
            return x10 == su.o.f31717a;
        }
        if (obj instanceof b) {
            return lu.f.C(((b) obj).a(), Boolean.TRUE, null, 2, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    @NotNull
    public final Object n1(E element) {
        m mVar;
        int i10;
        e<E> eVar;
        Object obj = lu.f.f23885d;
        m mVar2 = (m) q0().get(this);
        while (true) {
            long andIncrement = r0().getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean B0 = B0(andIncrement);
            int i11 = lu.f.b;
            long j11 = j10 / i11;
            int i12 = (int) (j10 % i11);
            if (mVar2.id != j11) {
                mVar = e0(j11, mVar2);
                if (mVar != null) {
                    eVar = this;
                    i10 = i12;
                } else if (B0) {
                    return k.INSTANCE.a(p0());
                }
            } else {
                mVar = mVar2;
                i10 = i12;
                eVar = this;
            }
            E e10 = element;
            int s12 = eVar.s1(mVar, i10, e10, j10, obj, B0);
            mVar2 = mVar;
            if (s12 == 0) {
                mVar2.b();
                return k.INSTANCE.c(Unit.f22894a);
            }
            if (s12 == 1) {
                return k.INSTANCE.c(Unit.f22894a);
            }
            if (s12 == 2) {
                if (B0) {
                    mVar2.t();
                    return k.INSTANCE.a(p0());
                }
                k3 k3Var = obj instanceof k3 ? (k3) obj : null;
                if (k3Var != null) {
                    W0(k3Var, mVar2, i10);
                }
                a0((mVar2.id * i11) + i10);
                return k.INSTANCE.c(Unit.f22894a);
            }
            if (s12 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (s12 == 4) {
                if (j10 < o0()) {
                    mVar2.b();
                }
                return k.INSTANCE.a(p0());
            }
            if (s12 == 5) {
                mVar2.b();
            }
            element = e10;
        }
    }

    public final long o0() {
        return f23857e.get(this);
    }

    public final boolean o1(m<E> segment, int index, long b10) {
        e0 e0Var;
        e0 e0Var2;
        Object B = segment.B(index);
        if ((B instanceof k3) && b10 >= f23857e.get(this)) {
            e0Var = lu.f.f23888g;
            if (segment.v(index, B, e0Var)) {
                if (m1(B, segment, index)) {
                    segment.F(index, lu.f.f23885d);
                    return true;
                }
                e0Var2 = lu.f.f23891j;
                segment.F(index, e0Var2);
                segment.C(index, false);
                return false;
            }
        }
        return p1(segment, index, b10);
    }

    @Override // lu.y
    public boolean offer(E e10) {
        return g.a.a(this, e10);
    }

    @NotNull
    public final Throwable p0() {
        Throwable i02 = i0();
        return i02 == null ? new r("Channel was closed") : i02;
    }

    public final boolean p1(m<E> segment, int index, long b10) {
        e0 e0Var;
        e0 e0Var2;
        e0 e0Var3;
        e0 e0Var4;
        e0 e0Var5;
        e0 e0Var6;
        e0 e0Var7;
        e0 e0Var8;
        while (true) {
            Object B = segment.B(index);
            if (!(B instanceof k3)) {
                e0Var3 = lu.f.f23891j;
                if (B != e0Var3) {
                    if (B != null) {
                        if (B != lu.f.f23885d) {
                            e0Var5 = lu.f.f23889h;
                            if (B == e0Var5) {
                                break;
                            }
                            e0Var6 = lu.f.f23890i;
                            if (B == e0Var6) {
                                break;
                            }
                            e0Var7 = lu.f.f23892k;
                            if (B == e0Var7 || B == lu.f.z()) {
                                return true;
                            }
                            e0Var8 = lu.f.f23887f;
                            if (B != e0Var8) {
                                throw new IllegalStateException(("Unexpected cell state: " + B).toString());
                            }
                        } else {
                            return true;
                        }
                    } else {
                        e0Var4 = lu.f.f23886e;
                        if (segment.v(index, B, e0Var4)) {
                            return true;
                        }
                    }
                } else {
                    return false;
                }
            } else if (b10 >= f23857e.get(this)) {
                e0Var = lu.f.f23888g;
                if (segment.v(index, B, e0Var)) {
                    if (m1(B, segment, index)) {
                        segment.F(index, lu.f.f23885d);
                        return true;
                    }
                    e0Var2 = lu.f.f23891j;
                    segment.F(index, e0Var2);
                    segment.C(index, false);
                    return false;
                }
            } else if (segment.v(index, B, new WaiterEB((k3) B))) {
                return true;
            }
        }
    }

    public final Object q1(m<E> segment, int index, long r8, Object waiter) {
        e0 e0Var;
        e0 e0Var2;
        e0 e0Var3;
        Object B = segment.B(index);
        if (B == null) {
            if (r8 >= (f23856d.get(this) & 1152921504606846975L)) {
                if (waiter == null) {
                    e0Var3 = lu.f.f23895n;
                    return e0Var3;
                }
                if (segment.v(index, B, waiter)) {
                    b0();
                    e0Var2 = lu.f.f23894m;
                    return e0Var2;
                }
            }
        } else if (B == lu.f.f23885d) {
            e0Var = lu.f.f23890i;
            if (segment.v(index, B, e0Var)) {
                b0();
                return segment.D(index);
            }
        }
        return r1(segment, index, r8, waiter);
    }

    public final Object r1(m<E> segment, int index, long r8, Object waiter) {
        e0 e0Var;
        e0 e0Var2;
        e0 e0Var3;
        e0 e0Var4;
        e0 e0Var5;
        e0 e0Var6;
        e0 e0Var7;
        e0 e0Var8;
        e0 e0Var9;
        e0 e0Var10;
        e0 e0Var11;
        e0 e0Var12;
        e0 e0Var13;
        e0 e0Var14;
        e0 e0Var15;
        e0 e0Var16;
        while (true) {
            Object B = segment.B(index);
            if (B != null) {
                e0Var5 = lu.f.f23886e;
                if (B != e0Var5) {
                    if (B == lu.f.f23885d) {
                        e0Var6 = lu.f.f23890i;
                        if (segment.v(index, B, e0Var6)) {
                            b0();
                            return segment.D(index);
                        }
                    } else {
                        e0Var7 = lu.f.f23891j;
                        if (B == e0Var7) {
                            e0Var8 = lu.f.f23896o;
                            return e0Var8;
                        }
                        e0Var9 = lu.f.f23889h;
                        if (B == e0Var9) {
                            e0Var10 = lu.f.f23896o;
                            return e0Var10;
                        }
                        if (B == lu.f.z()) {
                            b0();
                            e0Var11 = lu.f.f23896o;
                            return e0Var11;
                        }
                        e0Var12 = lu.f.f23888g;
                        if (B != e0Var12) {
                            e0Var13 = lu.f.f23887f;
                            if (segment.v(index, B, e0Var13)) {
                                boolean z10 = B instanceof WaiterEB;
                                if (z10) {
                                    B = ((WaiterEB) B).waiter;
                                }
                                if (m1(B, segment, index)) {
                                    e0Var16 = lu.f.f23890i;
                                    segment.F(index, e0Var16);
                                    b0();
                                    return segment.D(index);
                                }
                                e0Var14 = lu.f.f23891j;
                                segment.F(index, e0Var14);
                                segment.C(index, false);
                                if (z10) {
                                    b0();
                                }
                                e0Var15 = lu.f.f23896o;
                                return e0Var15;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            if (r8 < (f23856d.get(this) & 1152921504606846975L)) {
                e0Var = lu.f.f23889h;
                if (segment.v(index, B, e0Var)) {
                    b0();
                    e0Var2 = lu.f.f23896o;
                    return e0Var2;
                }
            } else {
                if (waiter == null) {
                    e0Var3 = lu.f.f23895n;
                    return e0Var3;
                }
                if (segment.v(index, B, waiter)) {
                    b0();
                    e0Var4 = lu.f.f23894m;
                    return e0Var4;
                }
            }
        }
    }

    @Override // lu.y
    public void s(@NotNull Function1<? super Throwable, Unit> handler) {
        e0 e0Var;
        e0 e0Var2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        e0 e0Var3;
        e0 e0Var4;
        if (y1.b.a(f23864l, this, null, handler)) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f23864l;
        do {
            Object obj = atomicReferenceFieldUpdater2.get(this);
            e0Var = lu.f.f23898q;
            if (obj != e0Var) {
                e0Var2 = lu.f.f23899r;
                if (obj == e0Var2) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            atomicReferenceFieldUpdater = f23864l;
            e0Var3 = lu.f.f23898q;
            e0Var4 = lu.f.f23899r;
        } while (!y1.b.a(atomicReferenceFieldUpdater, this, e0Var3, e0Var4));
        handler.invoke(i0());
    }

    public final long s0() {
        return f23856d.get(this) & 1152921504606846975L;
    }

    public final int s1(m<E> segment, int index, E element, long s8, Object waiter, boolean closed) {
        e0 e0Var;
        e0 e0Var2;
        e0 e0Var3;
        segment.G(index, element);
        if (closed) {
            return t1(segment, index, element, s8, waiter, closed);
        }
        Object B = segment.B(index);
        if (B == null) {
            if (S(s8)) {
                if (segment.v(index, null, lu.f.f23885d)) {
                    return 1;
                }
            } else {
                if (waiter == null) {
                    return 3;
                }
                if (segment.v(index, null, waiter)) {
                    return 2;
                }
            }
        } else if (B instanceof k3) {
            segment.w(index);
            if (l1(B, element)) {
                e0Var3 = lu.f.f23890i;
                segment.F(index, e0Var3);
                R0();
                return 0;
            }
            e0Var = lu.f.f23892k;
            Object x10 = segment.x(index, e0Var);
            e0Var2 = lu.f.f23892k;
            if (x10 == e0Var2) {
                return 5;
            }
            segment.C(index, true);
            return 5;
        }
        return t1(segment, index, element, s8, waiter, closed);
    }

    public final int t1(m<E> segment, int index, E element, long s8, Object waiter, boolean closed) {
        e0 e0Var;
        e0 e0Var2;
        e0 e0Var3;
        e0 e0Var4;
        e0 e0Var5;
        e0 e0Var6;
        e0 e0Var7;
        while (true) {
            Object B = segment.B(index);
            if (B != null) {
                e0Var2 = lu.f.f23886e;
                if (B != e0Var2) {
                    e0Var3 = lu.f.f23892k;
                    if (B == e0Var3) {
                        segment.w(index);
                        return 5;
                    }
                    e0Var4 = lu.f.f23889h;
                    if (B == e0Var4) {
                        segment.w(index);
                        return 5;
                    }
                    if (B == lu.f.z()) {
                        segment.w(index);
                        Z();
                        return 4;
                    }
                    segment.w(index);
                    if (B instanceof WaiterEB) {
                        B = ((WaiterEB) B).waiter;
                    }
                    if (l1(B, element)) {
                        e0Var7 = lu.f.f23890i;
                        segment.F(index, e0Var7);
                        R0();
                        return 0;
                    }
                    e0Var5 = lu.f.f23892k;
                    Object x10 = segment.x(index, e0Var5);
                    e0Var6 = lu.f.f23892k;
                    if (x10 != e0Var6) {
                        segment.C(index, true);
                    }
                    return 5;
                }
                if (segment.v(index, B, lu.f.f23885d)) {
                    return 1;
                }
            } else if (!S(s8) || closed) {
                if (closed) {
                    e0Var = lu.f.f23891j;
                    if (segment.v(index, null, e0Var)) {
                        segment.C(index, false);
                        return 4;
                    }
                } else {
                    if (waiter == null) {
                        return 3;
                    }
                    if (segment.v(index, null, waiter)) {
                        return 2;
                    }
                }
            } else if (segment.v(index, null, lu.f.f23885d)) {
                return 1;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x01df, code lost:
    
        r16 = r7;
        r3 = (lu.m) r3.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01e8, code lost:
    
        if (r3 != null) goto L95;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lu.e.toString():java.lang.String");
    }

    public final boolean u0() {
        while (true) {
            m<E> mVar = (m) f23861i.get(this);
            long o02 = o0();
            if (s0() <= o02) {
                return false;
            }
            int i10 = lu.f.b;
            long j10 = o02 / i10;
            if (mVar.id == j10 || (mVar = d0(j10, mVar)) != null) {
                mVar.b();
                if (y0(mVar, (int) (o02 % i10), o02)) {
                    return true;
                }
                f23857e.compareAndSet(this, o02, 1 + o02);
            } else if (((m) f23861i.get(this)).id < j10) {
                return false;
            }
        }
    }

    public final void u1(long value) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f23857e;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            if (j10 >= value) {
                return;
            }
            long j11 = value;
            if (f23857e.compareAndSet(this, j10, j11)) {
                return;
            } else {
                value = j11;
            }
        }
    }

    @Override // lu.y
    @NotNull
    public Object v(E element) {
        Object obj;
        E e10;
        int i10;
        m mVar;
        e<E> eVar;
        if (k1(f23856d.get(this))) {
            return k.INSTANCE.b();
        }
        obj = lu.f.f23891j;
        m mVar2 = (m) q0().get(this);
        while (true) {
            long andIncrement = r0().getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean B0 = B0(andIncrement);
            int i11 = lu.f.b;
            long j11 = j10 / i11;
            int i12 = (int) (j10 % i11);
            if (mVar2.id != j11) {
                m e02 = e0(j11, mVar2);
                if (e02 != null) {
                    i10 = i12;
                    mVar = e02;
                    eVar = this;
                    e10 = element;
                } else if (B0) {
                    return k.INSTANCE.a(p0());
                }
            } else {
                e10 = element;
                i10 = i12;
                mVar = mVar2;
                eVar = this;
            }
            int s12 = eVar.s1(mVar, i10, e10, j10, obj, B0);
            mVar2 = mVar;
            if (s12 == 0) {
                mVar2.b();
                return k.INSTANCE.c(Unit.f22894a);
            }
            if (s12 == 1) {
                return k.INSTANCE.c(Unit.f22894a);
            }
            if (s12 == 2) {
                if (B0) {
                    mVar2.t();
                    return k.INSTANCE.a(p0());
                }
                k3 k3Var = obj instanceof k3 ? (k3) obj : null;
                if (k3Var != null) {
                    W0(k3Var, mVar2, i10);
                }
                mVar2.t();
                return k.INSTANCE.b();
            }
            if (s12 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (s12 == 4) {
                if (j10 < o0()) {
                    mVar2.b();
                }
                return k.INSTANCE.a(p0());
            }
            if (s12 == 5) {
                mVar2.b();
            }
            element = e10;
        }
    }

    public final void v0(long nAttempts) {
        if ((f23859g.addAndGet(this, nAttempts) & 4611686018427387904L) != 0) {
            while ((f23859g.get(this) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final void v1(long value) {
        long j10;
        long w5;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f23856d;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            long j11 = 1152921504606846975L & j10;
            if (j11 >= value) {
                return;
            } else {
                w5 = lu.f.w(j11, (int) (j10 >> 60));
            }
        } while (!f23856d.compareAndSet(this, j10, w5));
    }

    public final void w1(long globalIndex) {
        int i10;
        long v5;
        long v10;
        long v11;
        e<E> eVar = this;
        if (eVar.D0()) {
            return;
        }
        while (eVar.g0() <= globalIndex) {
            eVar = this;
        }
        i10 = lu.f.f23884c;
        for (int i11 = 0; i11 < i10; i11++) {
            long g02 = eVar.g0();
            if (g02 == (4611686018427387903L & f23859g.get(eVar)) && g02 == eVar.g0()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f23859g;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(eVar);
            v5 = lu.f.v(j10 & 4611686018427387903L, true);
            if (atomicLongFieldUpdater.compareAndSet(eVar, j10, v5)) {
                break;
            } else {
                eVar = this;
            }
        }
        while (true) {
            long g03 = eVar.g0();
            long j11 = f23859g.get(eVar);
            long j12 = j11 & 4611686018427387903L;
            boolean z10 = (4611686018427387904L & j11) != 0;
            if (g03 == j12 && g03 == eVar.g0()) {
                break;
            }
            if (z10) {
                eVar = this;
            } else {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f23859g;
                v10 = lu.f.v(j12, true);
                eVar = this;
                atomicLongFieldUpdater2.compareAndSet(eVar, j11, v10);
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater3 = f23859g;
        while (true) {
            long j13 = atomicLongFieldUpdater3.get(eVar);
            v11 = lu.f.v(j13 & 4611686018427387903L, false);
            boolean compareAndSet = atomicLongFieldUpdater3.compareAndSet(eVar, j13, v11);
            AtomicLongFieldUpdater atomicLongFieldUpdater4 = atomicLongFieldUpdater3;
            if (compareAndSet) {
                return;
            }
            atomicLongFieldUpdater3 = atomicLongFieldUpdater4;
            eVar = this;
        }
    }

    public final void x0() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23864l;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!y1.b.a(atomicReferenceFieldUpdater, this, obj, obj == null ? lu.f.f23898q : lu.f.f23899r));
        if (obj == null) {
            return;
        }
        ((Function1) obj).invoke(i0());
    }

    @Override // lu.x
    @NotNull
    public su.h<E> y() {
        C0418e c0418e = C0418e.f23869a;
        Intrinsics.d(c0418e, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        yt.n nVar = (yt.n) h0.e(c0418e, 3);
        f fVar = f.f23870a;
        Intrinsics.d(fVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new su.i(this, nVar, (yt.n) h0.e(fVar, 3), this.onUndeliveredElementReceiveCancellationConstructor);
    }

    public final boolean y0(m<E> segment, int index, long globalIndex) {
        Object B;
        e0 e0Var;
        e0 e0Var2;
        e0 e0Var3;
        e0 e0Var4;
        e0 e0Var5;
        e0 e0Var6;
        e0 e0Var7;
        do {
            B = segment.B(index);
            if (B != null) {
                e0Var2 = lu.f.f23886e;
                if (B != e0Var2) {
                    if (B == lu.f.f23885d) {
                        return true;
                    }
                    e0Var3 = lu.f.f23891j;
                    if (B == e0Var3 || B == lu.f.z()) {
                        return false;
                    }
                    e0Var4 = lu.f.f23890i;
                    if (B == e0Var4) {
                        return false;
                    }
                    e0Var5 = lu.f.f23889h;
                    if (B == e0Var5) {
                        return false;
                    }
                    e0Var6 = lu.f.f23888g;
                    if (B == e0Var6) {
                        return true;
                    }
                    e0Var7 = lu.f.f23887f;
                    return B != e0Var7 && globalIndex == o0();
                }
            }
            e0Var = lu.f.f23889h;
        } while (!segment.v(index, B, e0Var));
        b0();
        return false;
    }

    @Override // lu.x
    @NotNull
    public su.h<k<E>> z() {
        g gVar = g.f23871a;
        Intrinsics.d(gVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        yt.n nVar = (yt.n) h0.e(gVar, 3);
        h hVar = h.f23872a;
        Intrinsics.d(hVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new su.i(this, nVar, (yt.n) h0.e(hVar, 3), this.onUndeliveredElementReceiveCancellationConstructor);
    }

    public final boolean z0(long sendersAndCloseStatusCur, boolean isClosedForReceive) {
        int i10 = (int) (sendersAndCloseStatusCur >> 60);
        if (i10 == 0 || i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            Y(sendersAndCloseStatusCur & 1152921504606846975L);
            return (isClosedForReceive && u0()) ? false : true;
        }
        if (i10 == 3) {
            X(sendersAndCloseStatusCur & 1152921504606846975L);
            return true;
        }
        throw new IllegalStateException(("unexpected close status: " + i10).toString());
    }
}
