.class public final Lfn/c$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmu/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfn/c$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lmu/i;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lfn/c;


# direct methods
.method public constructor <init>(Lfn/c;)V
    .locals 0

    iput-object p1, p0, Lfn/c$c$a;->a:Lfn/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b(Lfn/c;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lfn/c$c$a;->d(Lfn/c;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lfn/c;)Ljava/lang/String;
    .locals 2

    invoke-static {p0}, Lfn/c;->p(Lfn/c;)Lfn/s;

    move-result-object p0

    invoke-virtual {p0}, Lfn/s;->b0()Lfn/h0;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "First frame received for camera choice "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final c(Lfn/s$d;Lmt/b;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfn/s$d;",
            "Lmt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p2, Lfn/s$d$a;->a:Lfn/s$d$a;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_6

    instance-of p2, p1, Lfn/s$d$d;

    if-eqz p2, :cond_1

    check-cast p1, Lfn/s$d$d;

    invoke-virtual {p1}, Lfn/s$d$d;->a()Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lfn/c$c$a;->a:Lfn/c;

    invoke-static {p2}, Lfn/c;->r(Lfn/c;)Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    move-result-object v0

    iget-object p2, p0, Lfn/c$c$a;->a:Lfn/c;

    new-instance v2, Lfn/d;

    invoke-direct {v2, p2}, Lfn/d;-><init>(Lfn/c;)V

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-string v1, "camera"

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;->logDebugLogEvent$default(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZILjava/lang/Object;)V

    :cond_0
    iget-object p2, p0, Lfn/c$c$a;->a:Lfn/c;

    invoke-static {p2}, Lfn/c;->s(Lfn/c;)Lmu/c0;

    move-result-object p2

    new-instance v0, Lcom/withpersona/sdk2/camera/d$e;

    invoke-virtual {p1}, Lfn/s$d$d;->a()Z

    move-result p1

    invoke-direct {v0, p1}, Lcom/withpersona/sdk2/camera/d$e;-><init>(Z)V

    invoke-interface {p2, v0}, Lmu/c0;->setValue(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    sget-object p2, Lfn/s$d$b;->a:Lfn/s$d$b;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p1, p0, Lfn/c$c$a;->a:Lfn/c;

    invoke-static {p1}, Lfn/c;->s(Lfn/c;)Lmu/c0;

    move-result-object p1

    new-instance p2, Lcom/withpersona/sdk2/camera/d$a;

    iget-object v0, p0, Lfn/c$c$a;->a:Lfn/c;

    invoke-static {v0}, Lfn/c;->q(Lfn/c;)Z

    move-result v0

    const/4 v1, 0x0

    invoke-direct {p2, v0, v1}, Lcom/withpersona/sdk2/camera/d$a;-><init>(ZZ)V

    invoke-interface {p1, p2}, Lmu/c0;->setValue(Ljava/lang/Object;)V

    iget-object p1, p0, Lfn/c$c$a;->a:Lfn/c;

    invoke-static {p1}, Lfn/c;->o(Lfn/c;)Lfn/b0;

    move-result-object p2

    invoke-virtual {p2}, Lfn/b0;->h()Lfn/s;

    move-result-object p2

    invoke-static {p1, p2}, Lfn/c;->t(Lfn/c;Lfn/s;)V

    iget-object p1, p0, Lfn/c$c$a;->a:Lfn/c;

    invoke-static {p1, v1}, Lfn/c;->u(Lfn/c;Z)V

    goto :goto_0

    :cond_2
    instance-of p2, p1, Lfn/s$d$c;

    if-eqz p2, :cond_5

    check-cast p1, Lfn/s$d$c;

    invoke-virtual {p1}, Lfn/s$d$c;->a()Lfn/s$c;

    move-result-object p1

    instance-of p2, p1, Lfn/s$c$a;

    if-eqz p2, :cond_3

    iget-object p1, p0, Lfn/c$c$a;->a:Lfn/c;

    invoke-static {p1}, Lfn/c;->v(Lfn/c;)V

    goto :goto_0

    :cond_3
    instance-of p1, p1, Lfn/s$c$b;

    if-eqz p1, :cond_4

    iget-object p1, p0, Lfn/c$c$a;->a:Lfn/c;

    invoke-static {p1}, Lfn/c;->s(Lfn/c;)Lmu/c0;

    move-result-object p1

    sget-object p2, Lcom/withpersona/sdk2/camera/d$c;->a:Lcom/withpersona/sdk2/camera/d$c;

    invoke-interface {p1, p2}, Lmu/c0;->setValue(Ljava/lang/Object;)V

    goto :goto_0

    :cond_4
    new-instance p1, Lgt/l;

    invoke-direct {p1}, Lgt/l;-><init>()V

    throw p1

    :cond_5
    new-instance p1, Lgt/l;

    invoke-direct {p1}, Lgt/l;-><init>()V

    throw p1

    :cond_6
    :goto_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lmt/b;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfn/s$d;

    invoke-virtual {p0, p1, p2}, Lfn/c$c$a;->c(Lfn/s$d;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
