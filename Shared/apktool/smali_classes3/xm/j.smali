.class public final Lxm/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lju/p0;
.implements Lxm/f$b;
.implements Lwm/t$c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<PropsT:",
        "Ljava/lang/Object;",
        "StateT:",
        "Ljava/lang/Object;",
        "OutputT:",
        "Ljava/lang/Object;",
        "RenderingT:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lju/p0;",
        "Lxm/f$b;",
        "Lwm/t$c;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b0\u0001\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\t\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000*\u0004\u0008\u0000\u0010\u0001*\u0004\u0008\u0001\u0010\u0002*\u0004\u0008\u0002\u0010\u0003*\u0004\u0008\u0003\u0010\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\u0083\u0001\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n\u0012\u0006\u0010\u000c\u001a\u00028\u0000\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0016\u0008\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011\u0012\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u0015\u0012\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ3\u0010\u001f\u001a\u00028\u00032\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0002\u0008\u0003\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n2\u0006\u0010\u001e\u001a\u00028\u0000\u00a2\u0006\u0004\u0008\u001f\u0010 J%\u0010!\u001a\u00020\r2\u0016\u0010\u000b\u001a\u0012\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030\n\u00a2\u0006\u0004\u0008!\u0010\"J>\u0010(\u001a\u00020&2\u0006\u0010#\u001a\u00020\u001b2\"\u0010\'\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020&0%\u0012\u0006\u0012\u0004\u0018\u00010\u00120$H\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008(\u0010)J)\u0010.\u001a\u00020&\"\u0004\u0008\u0004\u0010*2\u0014\u0010-\u001a\u0010\u0012\u000c\u0012\n\u0012\u0004\u0012\u00028\u0004\u0018\u00010,0+\u00a2\u0006\u0004\u0008.\u0010/J\u001f\u00103\u001a\u00020&2\u0010\u0008\u0002\u00102\u001a\n\u0018\u000100j\u0004\u0018\u0001`1\u00a2\u0006\u0004\u00083\u00104J7\u00106\u001a\u00028\u00032\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n2\u0006\u00105\u001a\u00028\u0000H\u0002\u00a2\u0006\u0004\u00086\u0010 J7\u00108\u001a\u00020&2\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n2\u0006\u00107\u001a\u00028\u0000H\u0002\u00a2\u0006\u0004\u00088\u00109J5\u0010<\u001a\u0004\u0018\u00018\u0004\"\u0008\u0008\u0004\u0010**\u00020\u00122\u0018\u0010;\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020:H\u0002\u00a2\u0006\u0004\u0008<\u0010=J>\u0010?\u001a\u00020>2\u0006\u0010#\u001a\u00020\u001b2\"\u0010\'\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020&0%\u0012\u0006\u0012\u0004\u0018\u00010\u00120$H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008?\u0010@R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008A\u0010B\u001a\u0004\u0008C\u0010DR\"\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008(\u0010ER\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008F\u0010G\u001a\u0004\u0008H\u0010IR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008<\u0010JR\u001a\u0010N\u001a\u00020\u000f8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u00083\u0010K\u001a\u0004\u0008L\u0010MR\u001a\u0010T\u001a\u00020O8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008P\u0010Q\u001a\u0004\u0008R\u0010SR&\u0010W\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020U8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008?\u0010VR\u001a\u0010Z\u001a\u0008\u0012\u0004\u0012\u00020>0X8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008C\u0010YR\u0016\u0010]\u001a\u00028\u00008\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008[\u0010\\R,\u0010`\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020:0^8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008H\u0010_R\u0016\u0010b\u001a\u00028\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008a\u0010\\R\u0014\u0010e\u001a\u00020c8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008[\u0010dR\u0014\u0010f\u001a\u00020\u001b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008a\u0010\u001d\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006g"
    }
    d2 = {
        "Lxm/j;",
        "PropsT",
        "StateT",
        "OutputT",
        "RenderingT",
        "Lju/p0;",
        "Lxm/f$b;",
        "Lwm/t$c;",
        "Lxm/k;",
        "id",
        "Lwm/k;",
        "workflow",
        "initialProps",
        "Lwm/m;",
        "snapshot",
        "Lkotlin/coroutines/CoroutineContext;",
        "baseContext",
        "Lkotlin/Function1;",
        "",
        "emitOutputToParent",
        "parent",
        "Lwm/t;",
        "interceptor",
        "Lxm/d;",
        "idCounter",
        "<init>",
        "(Lxm/k;Lwm/k;Ljava/lang/Object;Lwm/m;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lwm/t$c;Lwm/t;Lxm/d;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "input",
        "m",
        "(Lwm/k;Ljava/lang/Object;)Ljava/lang/Object;",
        "o",
        "(Lwm/k;)Lwm/m;",
        "key",
        "Lkotlin/Function2;",
        "Lmt/b;",
        "",
        "sideEffect",
        "b",
        "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V",
        "T",
        "Lsu/d;",
        "Lwm/v;",
        "selector",
        "p",
        "(Lsu/d;)V",
        "Ljava/util/concurrent/CancellationException;",
        "Lkotlinx/coroutines/CancellationException;",
        "cause",
        "e",
        "(Ljava/util/concurrent/CancellationException;)V",
        "props",
        "n",
        "newProps",
        "q",
        "(Lwm/k;Ljava/lang/Object;)V",
        "Lwm/r;",
        "action",
        "d",
        "(Lwm/r;)Ljava/lang/Object;",
        "Lxm/g;",
        "g",
        "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Lxm/g;",
        "a",
        "Lxm/k;",
        "h",
        "()Lxm/k;",
        "Lkotlin/jvm/functions/Function1;",
        "c",
        "Lwm/t$c;",
        "j",
        "()Lwm/t$c;",
        "Lwm/t;",
        "Lkotlin/coroutines/CoroutineContext;",
        "I",
        "()Lkotlin/coroutines/CoroutineContext;",
        "coroutineContext",
        "",
        "f",
        "J",
        "l",
        "()J",
        "sessionId",
        "Lxm/h;",
        "Lxm/h;",
        "subtreeManager",
        "Lxm/a;",
        "Lxm/a;",
        "sideEffects",
        "i",
        "Ljava/lang/Object;",
        "lastProps",
        "Llu/g;",
        "Llu/g;",
        "eventActionsChannel",
        "k",
        "state",
        "Lwm/s;",
        "()Lwm/s;",
        "identifier",
        "renderKey",
        "wf1-workflow-runtime"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Lxm/k;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "TOutputT;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lwm/t$c;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final d:Lwm/t;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Lkotlin/coroutines/CoroutineContext;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final f:J

.field public final g:Lxm/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lxm/h<",
            "TPropsT;TStateT;TOutputT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final h:Lxm/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lxm/a<",
            "Lxm/g;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public i:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TPropsT;"
        }
    .end annotation
.end field

.field public final j:Llu/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Llu/g<",
            "Lwm/r<",
            "TPropsT;TStateT;TOutputT;>;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public k:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TStateT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lxm/k;Lwm/k;Ljava/lang/Object;Lwm/m;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lwm/t$c;Lwm/t;Lxm/d;)V
    .locals 7
    .param p1    # Lxm/k;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lwm/k;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lwm/m;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Lkotlin/coroutines/CoroutineContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lwm/t$c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p8    # Lwm/t;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p9    # Lxm/d;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxm/k;",
            "Lwm/k<",
            "-TPropsT;TStateT;+TOutputT;+TRenderingT;>;TPropsT;",
            "Lwm/m;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Lkotlin/jvm/functions/Function1<",
            "-TOutputT;+",
            "Ljava/lang/Object;",
            ">;",
            "Lwm/t$c;",
            "Lwm/t;",
            "Lxm/d;",
            ")V"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workflow"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "baseContext"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "emitOutputToParent"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "interceptor"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lxm/j;->a:Lxm/k;

    .line 3
    iput-object p6, p0, Lxm/j;->b:Lkotlin/jvm/functions/Function1;

    .line 4
    iput-object p7, p0, Lxm/j;->c:Lwm/t$c;

    .line 5
    iput-object p8, p0, Lxm/j;->d:Lwm/t;

    .line 6
    sget-object p6, Lju/d2;->Jo:Lju/d2$b;

    invoke-interface {p5, p6}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/CoroutineContext$b;)Lkotlin/coroutines/CoroutineContext$Element;

    move-result-object p6

    check-cast p6, Lju/d2;

    invoke-static {p6}, Lju/g2;->a(Lju/d2;)Lju/a0;

    move-result-object p6

    invoke-interface {p5, p6}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object p5

    new-instance p6, Lju/o0;

    invoke-virtual {p1}, Lxm/k;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p6, p1}, Lju/o0;-><init>(Ljava/lang/String;)V

    invoke-interface {p5, p6}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object p1

    iput-object p1, p0, Lxm/j;->e:Lkotlin/coroutines/CoroutineContext;

    if-nez p9, :cond_0

    const-wide/16 p5, 0x0

    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual/range {p9 .. p9}, Lxm/d;->a()J

    move-result-wide p5

    .line 8
    :goto_0
    iput-wide p5, p0, Lxm/j;->f:J

    .line 9
    new-instance v0, Lxm/h;

    const/4 p1, 0x0

    if-nez p4, :cond_1

    move-object v1, p1

    goto :goto_1

    .line 10
    :cond_1
    invoke-virtual {p4}, Lwm/m;->a()Ljava/util/Map;

    move-result-object p5

    move-object v1, p5

    .line 11
    :goto_1
    invoke-virtual {p0}, Lxm/j;->I()Lkotlin/coroutines/CoroutineContext;

    move-result-object v2

    .line 12
    new-instance v3, Lxm/j$c;

    invoke-direct {v3, p0}, Lxm/j$c;-><init>(Ljava/lang/Object;)V

    move-object v4, p0

    move-object v5, p8

    move-object/from16 v6, p9

    .line 13
    invoke-direct/range {v0 .. v6}, Lxm/h;-><init>(Ljava/util/Map;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lwm/t$c;Lwm/t;Lxm/d;)V

    iput-object v0, p0, Lxm/j;->g:Lxm/h;

    .line 14
    new-instance p5, Lxm/a;

    invoke-direct {p5}, Lxm/a;-><init>()V

    iput-object p5, p0, Lxm/j;->h:Lxm/a;

    .line 15
    iput-object p3, p0, Lxm/j;->i:Ljava/lang/Object;

    const p5, 0x7fffffff

    const/4 p6, 0x6

    .line 16
    invoke-static {p5, p1, p1, p6, p1}, Llu/j;->b(ILlu/a;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Llu/g;

    move-result-object p5

    iput-object p5, p0, Lxm/j;->j:Llu/g;

    .line 17
    invoke-interface {p8, p0, p0}, Lwm/t;->d(Lju/p0;Lwm/t$c;)V

    .line 18
    invoke-static {p8, p2, p0}, Lwm/u;->a(Lwm/t;Lwm/k;Lwm/t$c;)Lwm/k;

    move-result-object p2

    if-nez p4, :cond_2

    goto :goto_2

    .line 19
    :cond_2
    invoke-virtual {p4}, Lwm/m;->b()Lwm/i;

    move-result-object p1

    :goto_2
    invoke-virtual {p2, p3, p1}, Lwm/k;->d(Ljava/lang/Object;Lwm/i;)Ljava/lang/Object;

    move-result-object p1

    .line 20
    iput-object p1, p0, Lxm/j;->k:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lxm/k;Lwm/k;Ljava/lang/Object;Lwm/m;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lwm/t$c;Lwm/t;Lxm/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 12

    move/from16 v0, p10

    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_0

    .line 21
    sget-object v1, Lxm/j$a;->i:Lxm/j$a;

    move-object v8, v1

    goto :goto_0

    :cond_0
    move-object/from16 v8, p6

    :goto_0
    and-int/lit8 v1, v0, 0x40

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move-object v9, v2

    goto :goto_1

    :cond_1
    move-object/from16 v9, p7

    :goto_1
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_2

    .line 22
    sget-object v1, Lwm/e;->a:Lwm/e;

    move-object v10, v1

    goto :goto_2

    :cond_2
    move-object/from16 v10, p8

    :goto_2
    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_3

    move-object v11, v2

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object v2, p0

    goto :goto_3

    :cond_3
    move-object/from16 v11, p9

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    .line 23
    :goto_3
    invoke-direct/range {v2 .. v11}, Lxm/j;-><init>(Lxm/k;Lwm/k;Ljava/lang/Object;Lwm/m;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lwm/t$c;Lwm/t;Lxm/d;)V

    return-void
.end method

.method public static final synthetic c(Lxm/j;Lwm/r;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lxm/j;->d(Lwm/r;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lxm/j;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lxm/j;->e(Ljava/util/concurrent/CancellationException;)V

    return-void
.end method


# virtual methods
.method public I()Lkotlin/coroutines/CoroutineContext;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lxm/j;->e:Lkotlin/coroutines/CoroutineContext;

    return-object v0
.end method

.method public b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lju/p0;",
            "-",
            "Lmt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sideEffect"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lxm/j;->h:Lxm/a;

    invoke-static {v0}, Lxm/a;->b(Lxm/a;)Lxm/e;

    move-result-object v0

    invoke-virtual {v0}, Lxm/e;->b()Lxm/e$a;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    move-object v1, v0

    check-cast v1, Lxm/g;

    invoke-virtual {v1}, Lxm/g;->d()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {v0}, Lxm/e$a;->a()Lxm/e$a;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Expected side effect keys to be unique: \""

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x22

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    iget-object v0, p0, Lxm/j;->h:Lxm/a;

    invoke-static {v0}, Lxm/a;->a(Lxm/a;)Lxm/e;

    move-result-object v1

    invoke-virtual {v1}, Lxm/e;->b()Lxm/e$a;

    move-result-object v2

    const/4 v3, 0x0

    move-object v4, v3

    :goto_1
    if-eqz v2, :cond_5

    move-object v5, v2

    check-cast v5, Lxm/g;

    invoke-virtual {v5}, Lxm/g;->d()Ljava/lang/String;

    move-result-object v5

    invoke-static {p1, v5}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    if-nez v4, :cond_2

    invoke-interface {v2}, Lxm/e$a;->a()Lxm/e$a;

    move-result-object v5

    invoke-virtual {v1, v5}, Lxm/e;->e(Lxm/e$a;)V

    goto :goto_2

    :cond_2
    invoke-interface {v2}, Lxm/e$a;->a()Lxm/e$a;

    move-result-object v5

    invoke-interface {v4, v5}, Lxm/e$a;->b(Lxm/e$a;)V

    :goto_2
    invoke-virtual {v1}, Lxm/e;->c()Lxm/e$a;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {v1, v4}, Lxm/e;->f(Lxm/e$a;)V

    :cond_3
    invoke-interface {v2, v3}, Lxm/e$a;->b(Lxm/e$a;)V

    move-object v3, v2

    goto :goto_3

    :cond_4
    invoke-interface {v2}, Lxm/e$a;->a()Lxm/e$a;

    move-result-object v4

    move-object v6, v4

    move-object v4, v2

    move-object v2, v6

    goto :goto_1

    :cond_5
    :goto_3
    if-nez v3, :cond_6

    invoke-virtual {p0, p1, p2}, Lxm/j;->g(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Lxm/g;

    move-result-object v3

    :cond_6
    invoke-static {v0}, Lxm/a;->b(Lxm/a;)Lxm/e;

    move-result-object p1

    invoke-virtual {p1, v3}, Lxm/e;->d(Lxm/e$a;)V

    return-void
.end method

.method public final d(Lwm/r;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lwm/r<",
            "-TPropsT;TStateT;+TOutputT;>;)TT;"
        }
    .end annotation

    iget-object v0, p0, Lxm/j;->i:Ljava/lang/Object;

    iget-object v1, p0, Lxm/j;->k:Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Lwm/w;->h(Lwm/r;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-virtual {p1}, Lkotlin/Pair;->a()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1}, Lkotlin/Pair;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lwm/v;

    iput-object v0, p0, Lxm/j;->k:Ljava/lang/Object;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lxm/j;->b:Lkotlin/jvm/functions/Function1;

    invoke-virtual {p1}, Lwm/v;->a()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final e(Ljava/util/concurrent/CancellationException;)V
    .locals 1
    .param p1    # Ljava/util/concurrent/CancellationException;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    invoke-virtual {p0}, Lxm/j;->I()Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    invoke-static {v0, p1}, Lju/g2;->c(Lkotlin/coroutines/CoroutineContext;Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public final g(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Lxm/g;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lju/p0;",
            "-",
            "Lmt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "Lxm/g;"
        }
    .end annotation

    new-instance v0, Lju/o0;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "sideEffect["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "] for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lxm/j;->a:Lxm/k;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lju/o0;-><init>(Ljava/lang/String;)V

    invoke-static {p0, v0}, Lju/q0;->j(Lju/p0;Lkotlin/coroutines/CoroutineContext;)Lju/p0;

    move-result-object v2

    sget-object v4, Lju/r0;->b:Lju/r0;

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v3, 0x0

    move-object v5, p2

    invoke-static/range {v2 .. v7}, Lju/i;->d(Lju/p0;Lkotlin/coroutines/CoroutineContext;Lju/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lju/d2;

    move-result-object p2

    new-instance v0, Lxm/g;

    invoke-direct {v0, p1, p2}, Lxm/g;-><init>(Ljava/lang/String;Lju/d2;)V

    return-object v0
.end method

.method public final h()Lxm/k;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lxm/j;->a:Lxm/k;

    return-object v0
.end method

.method public i()Lwm/s;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lxm/j;->a:Lxm/k;

    invoke-virtual {v0}, Lxm/k;->a()Lwm/s;

    move-result-object v0

    return-object v0
.end method

.method public j()Lwm/t$c;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lxm/j;->c:Lwm/t$c;

    return-object v0
.end method

.method public k()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lxm/j;->a:Lxm/k;

    invoke-virtual {v0}, Lxm/k;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public l()J
    .locals 2

    iget-wide v0, p0, Lxm/j;->f:J

    return-wide v0
.end method

.method public final m(Lwm/k;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1    # Lwm/k;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwm/k<",
            "-TPropsT;*+TOutputT;+TRenderingT;>;TPropsT;)TRenderingT;"
        }
    .end annotation

    const-string v0, "workflow"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lxm/j;->n(Lwm/k;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final n(Lwm/k;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwm/k<",
            "-TPropsT;TStateT;+TOutputT;+TRenderingT;>;TPropsT;)TRenderingT;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lxm/j;->q(Lwm/k;Ljava/lang/Object;)V

    new-instance v0, Lxm/f;

    iget-object v1, p0, Lxm/j;->g:Lxm/h;

    iget-object v2, p0, Lxm/j;->j:Llu/g;

    invoke-direct {v0, v1, p0, v2}, Lxm/f;-><init>(Lxm/f$a;Lxm/f$b;Llu/y;)V

    iget-object v1, p0, Lxm/j;->d:Lwm/t;

    invoke-static {v1, p1, p0}, Lwm/u;->a(Lwm/t;Lwm/k;Lwm/t$c;)Lwm/k;

    move-result-object v1

    iget-object v2, p0, Lxm/j;->k:Ljava/lang/Object;

    invoke-static {v0, p1}, Lwm/w;->a(Lwm/a;Lwm/k;)Lwm/k$a;

    move-result-object p1

    invoke-virtual {v1, p2, v2, p1}, Lwm/k;->f(Ljava/lang/Object;Ljava/lang/Object;Lwm/k$a;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0}, Lxm/f;->f()V

    iget-object p2, p0, Lxm/j;->g:Lxm/h;

    invoke-virtual {p2}, Lxm/h;->c()V

    iget-object p2, p0, Lxm/j;->h:Lxm/a;

    invoke-static {p2}, Lxm/a;->b(Lxm/a;)Lxm/e;

    move-result-object p2

    invoke-virtual {p2}, Lxm/e;->b()Lxm/e$a;

    move-result-object p2

    :goto_0
    if-eqz p2, :cond_0

    move-object v0, p2

    check-cast v0, Lxm/g;

    invoke-virtual {v0}, Lxm/g;->c()Lju/d2;

    move-result-object v0

    invoke-interface {v0}, Lju/d2;->start()Z

    invoke-interface {p2}, Lxm/e$a;->a()Lxm/e$a;

    move-result-object p2

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lxm/j;->h:Lxm/a;

    invoke-static {p2}, Lxm/a;->a(Lxm/a;)Lxm/e;

    move-result-object v0

    invoke-virtual {v0}, Lxm/e;->b()Lxm/e$a;

    move-result-object v0

    :goto_1
    if-eqz v0, :cond_1

    move-object v1, v0

    check-cast v1, Lxm/g;

    invoke-virtual {v1}, Lxm/g;->c()Lju/d2;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v1, v3, v2, v3}, Lju/d2$a;->a(Lju/d2;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    invoke-interface {v0}, Lxm/e$a;->a()Lxm/e$a;

    move-result-object v0

    goto :goto_1

    :cond_1
    invoke-static {p2}, Lxm/a;->a(Lxm/a;)Lxm/e;

    move-result-object v0

    invoke-static {p2}, Lxm/a;->b(Lxm/a;)Lxm/e;

    move-result-object v1

    invoke-static {p2, v1}, Lxm/a;->c(Lxm/a;Lxm/e;)V

    invoke-static {p2, v0}, Lxm/a;->d(Lxm/a;Lxm/e;)V

    invoke-static {p2}, Lxm/a;->b(Lxm/a;)Lxm/e;

    move-result-object p2

    invoke-virtual {p2}, Lxm/e;->a()V

    return-object p1
.end method

.method public final o(Lwm/k;)Lwm/m;
    .locals 3
    .param p1    # Lwm/k;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwm/k<",
            "****>;)",
            "Lwm/m;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "workflow"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lxm/j;->g:Lxm/h;

    invoke-virtual {v0}, Lxm/h;->f()Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lxm/j;->d:Lwm/t;

    invoke-static {v1, p1, p0}, Lwm/u;->a(Lwm/t;Lwm/k;Lwm/t$c;)Lwm/k;

    move-result-object p1

    iget-object v1, p0, Lxm/j;->k:Ljava/lang/Object;

    invoke-virtual {p1, v1}, Lwm/k;->g(Ljava/lang/Object;)Lwm/i;

    move-result-object p1

    new-instance v1, Lwm/m;

    new-instance v2, Lxm/j$b;

    invoke-direct {v2, v0}, Lxm/j$b;-><init>(Ljava/util/Map;)V

    invoke-direct {v1, p1, v2}, Lwm/m;-><init>(Lwm/i;Lkotlin/jvm/functions/Function0;)V

    return-object v1
.end method

.method public final p(Lsu/d;)V
    .locals 3
    .param p1    # Lsu/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lsu/d<",
            "-",
            "Lwm/v<",
            "+TT;>;>;)V"
        }
    .end annotation

    const-string v0, "selector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lxm/j;->g:Lxm/h;

    invoke-virtual {v0, p1}, Lxm/h;->g(Lsu/d;)V

    iget-object v0, p0, Lxm/j;->j:Llu/g;

    invoke-interface {v0}, Llu/x;->y()Lsu/h;

    move-result-object v0

    new-instance v1, Lxm/j$d;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lxm/j$d;-><init>(Lxm/j;Lmt/b;)V

    invoke-interface {p1, v0, v1}, Lsu/d;->a(Lsu/h;Lkotlin/jvm/functions/Function2;)V

    return-void
.end method

.method public final q(Lwm/k;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwm/k<",
            "-TPropsT;TStateT;+TOutputT;+TRenderingT;>;TPropsT;)V"
        }
    .end annotation

    iget-object v0, p0, Lxm/j;->i:Ljava/lang/Object;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lxm/j;->d:Lwm/t;

    invoke-static {v0, p1, p0}, Lwm/u;->a(Lwm/t;Lwm/k;Lwm/t$c;)Lwm/k;

    move-result-object p1

    iget-object v0, p0, Lxm/j;->i:Ljava/lang/Object;

    iget-object v1, p0, Lxm/j;->k:Ljava/lang/Object;

    invoke-virtual {p1, v0, p2, v1}, Lwm/k;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lxm/j;->k:Ljava/lang/Object;

    :cond_0
    iput-object p2, p0, Lxm/j;->i:Ljava/lang/Object;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-virtual {p0}, Lxm/j;->j()Lwm/t$c;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const-string v0, "WorkflowInstance(\u2026)"

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "WorkflowInstance(identifier="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lxm/j;->i()Lwm/s;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", renderKey="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lxm/j;->k()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", instanceId="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lxm/j;->l()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ", parent="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v0, 0x29

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
