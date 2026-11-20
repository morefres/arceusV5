package com.roblox.client.pushnotification.notificationreceivers;

import android.content.Context;
import android.content.Intent;
import com.roblox.client.pushnotification.notificationreceivers.ChatMessageNotificationReceiver;
import ek.q;
import gt.n;
import gt.o;
import hj.i;
import hj.u;
import ju.p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mi.d;
import mi.e;
import nt.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.f;
import ot.m;
import zl.t;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\r\n\u0002\b\u0012\u0018\u00002\u00020\u0001B'\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0010\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0010\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0011\u0010\u000fJ#\u0010\u0013\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0013\u0010\u0014JE\u0010\u001d\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010 \u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b \u0010!JG\u0010#\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u00152\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\u0014\u0010*\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/roblox/client/pushnotification/notificationreceivers/ChatMessageNotificationReceiver;", "Llj/a;", "Lkotlin/Function0;", "Lhj/u;", "pushNotificationStoreProvider", "Lhj/i;", "newNotificationHandlerProvider", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "j", "i", "bundle", "k", "(Landroid/content/Intent;Landroid/content/Context;Landroid/content/Intent;)Landroid/content/Intent;", "", "conversationGuid", "", "conversationId", "", "replyMessage", "categoryName", "conversationTitle", "s", "(Ljava/lang/String;JLjava/lang/CharSequence;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "messageId", "r", "(JLjava/lang/String;Ljava/lang/String;)V", "message", t.f38095d, "(Ljava/lang/String;JLjava/lang/String;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", j6.b.f21518e, "Lkotlin/jvm/functions/Function0;", "c", "q", "()Lhj/u;", "pushNotificationStore", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ChatMessageNotificationReceiver extends lj.a {

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function0<u> pushNotificationStoreProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function0<i> newNotificationHandlerProvider;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.roblox.client.pushnotification.notificationreceivers.ChatMessageNotificationReceiver$markChatNotificationAsRead$1", f = "ChatMessageNotificationReceiver.kt", l = {93}, m = "invokeSuspend", v = 1)
    public static final class a extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f9295t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ long f9296u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f9297v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j10, String str, mt.b<? super a> bVar) {
            super(2, bVar);
            this.f9296u = j10;
            this.f9297v = str;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new a(this.f9296u, this.f9297v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = c.e();
            int i10 = this.f9295t;
            if (i10 == 0) {
                o.b(obj);
                long j10 = this.f9296u;
                String str = this.f9297v;
                this.f9295t = 1;
                if (d.a(j10, str, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @f(c = "com.roblox.client.pushnotification.notificationreceivers.ChatMessageNotificationReceiver$sendMessageCoroutine$1", f = "ChatMessageNotificationReceiver.kt", l = {107}, m = "invokeSuspend", v = 1)
    public static final class b extends m implements Function1<mt.b<? super Unit>, Object> {
        public final /* synthetic */ String A;

        /* renamed from: t, reason: collision with root package name */
        public int f9298t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ long f9299u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f9300v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f9301w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ ChatMessageNotificationReceiver f9302x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Context f9303y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ String f9304z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j10, String str, String str2, ChatMessageNotificationReceiver chatMessageNotificationReceiver, Context context, String str3, String str4, mt.b<? super b> bVar) {
            super(1, bVar);
            this.f9299u = j10;
            this.f9300v = str;
            this.f9301w = str2;
            this.f9302x = chatMessageNotificationReceiver;
            this.f9303y = context;
            this.f9304z = str3;
            this.A = str4;
        }

        @Override // ot.a
        public final mt.b<Unit> create(mt.b<?> bVar) {
            return new b(this.f9299u, this.f9300v, this.f9301w, this.f9302x, this.f9303y, this.f9304z, this.A, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object b;
            Object e10 = c.e();
            int i10 = this.f9298t;
            if (i10 == 0) {
                o.b(obj);
                long j10 = this.f9299u;
                String str = this.f9300v;
                String str2 = this.f9301w;
                this.f9298t = 1;
                b = d.b(j10, str, str2, this);
                if (b == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                b = ((n) obj).getValue();
            }
            ChatMessageNotificationReceiver chatMessageNotificationReceiver = this.f9302x;
            Context context = this.f9303y;
            String str3 = this.f9304z;
            String str4 = this.f9300v;
            long j11 = this.f9299u;
            String str5 = this.A;
            Throwable e11 = n.e(b);
            if (e11 != null && (e11 instanceof e)) {
                boolean c10 = Intrinsics.c("moderated", ((e) e11).getResultType());
                i iVar = (i) chatMessageNotificationReceiver.newNotificationHandlerProvider.invoke();
                if (str4 == null) {
                    str4 = String.valueOf(j11);
                }
                iVar.f(context, str3, str4, str5, c10);
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mt.b<? super Unit> bVar) {
            return ((b) create(bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChatMessageNotificationReceiver() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static final u n() {
        return u.c();
    }

    public static final i o() {
        return new i();
    }

    @Override // lj.a
    public void i(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        q().i(intent.getStringExtra("EXTRA_CATEGORY"));
        g(context, intent);
        lj.a.e(this, "clicked", context, intent, true, "ChatNewMessage", null, null, 96, null);
    }

    @Override // lj.a
    public void j(@Nullable Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        q().i(intent.getStringExtra("EXTRA_CATEGORY"));
        lj.a.e(this, "dismissed", context, intent, false, "ChatNewMessage", null, null, 96, null);
    }

    @Override // lj.a
    @NotNull
    public Intent k(@NotNull Intent intent, @NotNull Context context, @NotNull Intent bundle) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        intent.putExtra("EXTRA_NOTIFICATION_TYPE", "ChatNewMessage");
        intent.putExtra("EXTRA_CONVERSATION_ID", bundle.getLongExtra("EXTRA_CONVERSATION_ID", -1L));
        return intent;
    }

    @Override // lj.a, rg.w0, android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @Nullable Intent intent) {
        String action;
        Intrinsics.checkNotNullParameter(context, "context");
        super.onReceive(context, intent);
        if (intent == null || (action = intent.getAction()) == null) {
            return;
        }
        if (!Intrinsics.c(action, "chat_message_replied")) {
            action = null;
        }
        if (action == null) {
            return;
        }
        q.i("rbx.push", "CMNR.onReceive() INTENT_ACTION_CHAT_MESSAGE_REPLIED");
        long longExtra = intent.getLongExtra("EXTRA_CONVERSATION_ID", -1L);
        String stringExtra = intent.getStringExtra("EXTRA_CONVERSATION_ID");
        String stringExtra2 = intent.getStringExtra("EXTRA_MESSAGE_ID");
        b(context, intent.getStringExtra("tag"), stringExtra2 != null ? Integer.parseInt(stringExtra2) : 3);
        CharSequence B = hj.c.B(intent);
        if (B == null) {
            return;
        }
        String stringExtra3 = intent.getStringExtra("EXTRA_CATEGORY");
        String stringExtra4 = intent.getStringExtra("EXTRA_CONVERSATION_TITLE");
        String stringExtra5 = intent.getStringExtra("EXTRA_MESSAGE_ID");
        s(stringExtra, longExtra, B, context, stringExtra3, stringExtra4);
        q().i(stringExtra3);
        r(longExtra, stringExtra, stringExtra5);
        lj.a.e(this, "chat message replied", context, intent, true, "ChatNewMessage", null, null, 96, null);
    }

    public final u q() {
        return this.pushNotificationStoreProvider.invoke();
    }

    public final void r(long conversationId, String conversationGuid, String messageId) {
        q.i("rbx.push", "In markChatNotificationAsRead(), conversationId: " + conversationId + " ,messageId: " + messageId);
        mi.c.f24511a.f(new a(conversationId, conversationGuid, null));
    }

    public final void s(String conversationGuid, long conversationId, CharSequence replyMessage, Context context, String categoryName, String conversationTitle) {
        t(conversationGuid, conversationId, replyMessage.toString(), context, categoryName, conversationTitle);
    }

    public final void t(String conversationGuid, long conversationId, String message, Context context, String categoryName, String conversationTitle) {
        mi.c.f24511a.c(conversationGuid == null ? String.valueOf(conversationId) : conversationGuid, new b(conversationId, conversationGuid, message, this, context, categoryName, conversationTitle, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChatMessageNotificationReceiver(@NotNull Function0<? extends u> pushNotificationStoreProvider, @NotNull Function0<? extends i> newNotificationHandlerProvider) {
        Intrinsics.checkNotNullParameter(pushNotificationStoreProvider, "pushNotificationStoreProvider");
        Intrinsics.checkNotNullParameter(newNotificationHandlerProvider, "newNotificationHandlerProvider");
        this.pushNotificationStoreProvider = pushNotificationStoreProvider;
        this.newNotificationHandlerProvider = newNotificationHandlerProvider;
    }

    public /* synthetic */ ChatMessageNotificationReceiver(Function0 function0, Function0 function02, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new Function0() { // from class: lj.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                u n10;
                n10 = ChatMessageNotificationReceiver.n();
                return n10;
            }
        } : function0, (i10 & 2) != 0 ? new Function0() { // from class: lj.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                i o8;
                o8 = ChatMessageNotificationReceiver.o();
                return o8;
            }
        } : function02);
    }
}
