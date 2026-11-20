.class public Lhj/r;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhj/r$d;,
        Lhj/r$b;,
        Lhj/r$c;
    }
.end annotation


# instance fields
.field public a:Landroid/os/Bundle;

.field public b:Lhj/r$d;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lhj/r$a;

    invoke-direct {v0, p0}, Lhj/r$a;-><init>(Lhj/r;)V

    iput-object v0, p0, Lhj/r;->b:Lhj/r$d;

    return-void
.end method

.method public static E(Landroid/content/Context;)V
    .locals 1

    invoke-static {}, Lrg/a1;->q0()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0}, Lx5/p0;->h(Landroid/content/Context;)Lx5/p0;

    move-result-object p0

    sget-object v0, Lcom/roblox/client/pushnotification/backgroundjob/PushNotificationSettingsWorker;->a:Lcom/roblox/client/pushnotification/backgroundjob/PushNotificationSettingsWorker$a;

    invoke-virtual {v0, p0}, Lcom/roblox/client/pushnotification/backgroundjob/PushNotificationSettingsWorker$a;->b(Lx5/p0;)V

    :cond_0
    return-void
.end method

.method public static synthetic a(Lhj/r$d;Landroid/content/Context;Lkj/k0;)Lkotlin/Unit;
    .locals 0

    invoke-interface {p0, p2, p1}, Lhj/r$d;->a(Lkj/k0;Landroid/content/Context;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic b()Lkotlin/Unit;
    .locals 3

    invoke-static {}, Lev/c;->d()Lev/c;

    move-result-object v0

    new-instance v1, Loh/h;

    const-string v2, "PushNotificationRegistrationFailed"

    invoke-direct {v1, v2}, Loh/h;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lev/c;->j(Ljava/lang/Object;)V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public static synthetic c(Landroid/content/Context;)V
    .locals 1

    invoke-static {p0}, Lx5/p0;->h(Landroid/content/Context;)Lx5/p0;

    move-result-object p0

    sget-object v0, Lcom/roblox/client/pushnotification/backgroundjob/PushNotificationSettingsWorker;->a:Lcom/roblox/client/pushnotification/backgroundjob/PushNotificationSettingsWorker$a;

    invoke-virtual {v0, p0}, Lcom/roblox/client/pushnotification/backgroundjob/PushNotificationSettingsWorker$a;->a(Lx5/p0;)V

    return-void
.end method

.method public static bridge synthetic d(Lhj/r;Landroid/content/Context;)Lhj/s;
    .locals 0

    invoke-virtual {p0, p1}, Lhj/r;->q(Landroid/content/Context;)Lhj/s;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic e(Lhj/r;Landroid/content/Context;)V
    .locals 0

    invoke-virtual {p0, p1}, Lhj/r;->D(Landroid/content/Context;)V

    return-void
.end method

.method public static f(Landroid/content/Context;Lnj/b;)V
    .locals 5

    invoke-static {p0}, Lk2/n;->f(Landroid/content/Context;)Lk2/n;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Lnj/b;->h()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Landroid/app/NotificationChannel;

    invoke-virtual {p1}, Lnj/b;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lnj/b;->e()I

    move-result v4

    invoke-direct {v2, v3, v1, v4}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v1

    invoke-interface {v1}, Lrh/i;->t0()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lnj/b;->d()Lnj/c;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lnj/b;->d()Lnj/c;

    move-result-object v1

    invoke-virtual {v1}, Lnj/c;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/app/NotificationChannel;->setGroup(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p1}, Lnj/b;->b()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p1}, Lnj/b;->b()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Landroid/app/NotificationChannel;->setDescription(Ljava/lang/String;)V

    :cond_1
    invoke-virtual {p1}, Lnj/b;->n()Z

    move-result p0

    if-nez p0, :cond_2

    invoke-virtual {p1}, Lnj/b;->l()Landroid/net/Uri;

    move-result-object p0

    invoke-virtual {p1}, Lnj/b;->j()Landroid/media/AudioAttributes;

    move-result-object v1

    invoke-virtual {v2, p0, v1}, Landroid/app/NotificationChannel;->setSound(Landroid/net/Uri;Landroid/media/AudioAttributes;)V

    invoke-virtual {p1}, Lnj/b;->o()[J

    move-result-object p0

    invoke-virtual {v2, p0}, Landroid/app/NotificationChannel;->setVibrationPattern([J)V

    :cond_2
    invoke-virtual {v0, v2}, Lk2/n;->c(Landroid/app/NotificationChannel;)V

    return-void
.end method

.method public static k()Lhj/r;
    .locals 1

    invoke-static {}, Lhj/r$b;->a()Lhj/r;

    move-result-object v0

    return-object v0
.end method

.method public static l()Ljava/util/List;
    .locals 5
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/roblox/client/datastructures/NameValuePair;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {}, Lcom/roblox/client/RobloxApplication;->f()Landroid/content/Context;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v2, Ljava/util/HashMap;

    invoke-static {v1}, Lug/r;->a(Landroid/content/Context;)Ljava/util/Map;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    const-string v3, "channel_settings"

    invoke-static {v1}, Lug/r;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    new-instance v3, Lcom/roblox/client/datastructures/NameValuePair;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-direct {v3, v4, v2}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method


# virtual methods
.method public A(Landroid/content/Context;ZLhj/s;)V
    .locals 0

    if-eqz p3, :cond_0

    invoke-interface {p3, p1, p2}, Lhj/s;->d(Landroid/content/Context;Z)V

    :cond_0
    return-void
.end method

.method public B(Landroid/content/Context;ZLjj/a;Lhj/x;Lhj/r$d;Lhj/r$c;)V
    .locals 7

    if-nez p2, :cond_0

    invoke-virtual {p3, p6}, Ljj/a;->a(Lhj/r$c;)V

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lhj/r;->q(Landroid/content/Context;)Lhj/s;

    move-result-object p2

    if-nez p2, :cond_1

    goto :goto_0

    :cond_1
    sget p6, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x21

    if-lt p6, v0, :cond_2

    const/4 p2, 0x1

    invoke-virtual {p0, p1, p2}, Lhj/r;->z(Landroid/content/Context;Z)V

    return-void

    :cond_2
    invoke-interface {p2}, Lhj/s;->c()Ljava/lang/String;

    move-result-object p2

    const/4 p6, 0x0

    invoke-virtual {p0, p6, p1, p4, p2}, Lhj/r;->m(Ljava/lang/String;Landroid/content/Context;Lhj/x;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3

    if-eqz p2, :cond_3

    const/4 v3, 0x0

    const/4 v4, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v5, p3

    move-object v6, p5

    invoke-virtual/range {v0 .. v6}, Lhj/r;->F(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLjj/a;Lhj/r$d;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public C(Landroid/content/Context;Lnj/f;)Ljava/lang/String;
    .locals 4

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v0

    invoke-interface {v0}, Lrh/i;->R0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Lnj/f;->l()Lcom/roblox/client/pushnotification/v2/model/PayloadNotificationChannel;

    move-result-object v0

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {p1, v0}, Lmj/b;->d(Landroid/content/Context;Lcom/roblox/client/pushnotification/v2/model/PayloadNotificationChannel;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    const-string v1, "rbx.push"

    const-string v2, "Failed to register payload notification channel"

    invoke-static {v1, v2, v0}, Lek/q;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    invoke-static {p1}, Lk2/n;->f(Landroid/content/Context;)Lk2/n;

    move-result-object v0

    invoke-interface {p2}, Lnj/f;->s()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lk2/n;->k()Ljava/util/List;

    move-result-object v2

    invoke-static {v2, v1}, Lmj/b;->g(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v0, v1}, Lk2/n;->e(Ljava/lang/String;)V

    return-object v2

    :cond_1
    invoke-virtual {v0, v1}, Lk2/n;->h(Ljava/lang/String;)Landroid/app/NotificationChannel;

    move-result-object v0

    if-eqz v0, :cond_2

    return-object v1

    :cond_2
    invoke-static {}, Lnj/b;->c()Lpt/a;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnj/b;

    invoke-virtual {v2}, Lnj/b;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_0

    :cond_4
    const/4 v2, 0x0

    :goto_0
    if-nez v2, :cond_6

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object p1

    invoke-interface {p1}, Lrh/i;->t0()Z

    move-result p1

    if-eqz p1, :cond_5

    sget-object p1, Lnj/b;->A:Lnj/b;

    invoke-virtual {p1}, Lnj/b;->getId()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_5
    invoke-interface {p2}, Lnj/f;->m()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_6
    invoke-static {p1, v2}, Lhj/r;->f(Landroid/content/Context;Lnj/b;)V

    invoke-virtual {v2}, Lnj/b;->getId()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final D(Landroid/content/Context;)V
    .locals 1

    invoke-static {p1}, Lx5/p0;->h(Landroid/content/Context;)Lx5/p0;

    move-result-object p1

    sget-object v0, Lcom/roblox/client/pushnotification/backgroundjob/PushNotificationSettingsWorker;->a:Lcom/roblox/client/pushnotification/backgroundjob/PushNotificationSettingsWorker$a;

    invoke-virtual {v0, p1}, Lcom/roblox/client/pushnotification/backgroundjob/PushNotificationSettingsWorker$a;->b(Lx5/p0;)V

    return-void
.end method

.method public F(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLjj/a;Lhj/r$d;)V
    .locals 1

    if-eqz p5, :cond_0

    if-eqz p2, :cond_0

    if-eqz p6, :cond_0

    move-object v0, p1

    move-object p1, p5

    new-instance p5, Lhj/o;

    invoke-direct {p5, p6, v0}, Lhj/o;-><init>(Lhj/r$d;Landroid/content/Context;)V

    new-instance p6, Lhj/p;

    invoke-direct {p6}, Lhj/p;-><init>()V

    invoke-virtual/range {p1 .. p6}, Ljj/a;->f(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    :cond_0
    return-void
.end method

.method public G(Landroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, Lhj/r;->a:Landroid/os/Bundle;

    return-void
.end method

.method public H(Landroid/content/Context;Ljava/lang/String;Lhj/x;Ljava/lang/String;)V
    .locals 2

    if-eqz p4, :cond_0

    if-eqz p3, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.push"

    invoke-static {v1, v0}, Lek/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p3, p1, p4, p2}, Lhj/x;->g(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final g(Landroid/content/Context;Lnj/b;)V
    .locals 0

    invoke-static {p1}, Lk2/n;->f(Landroid/content/Context;)Lk2/n;

    move-result-object p1

    invoke-virtual {p2}, Lnj/b;->getId()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lk2/n;->e(Ljava/lang/String;)V

    return-void
.end method

.method public final h(Landroid/content/Context;)V
    .locals 2

    invoke-static {p1}, Lk2/n;->f(Landroid/content/Context;)Lk2/n;

    move-result-object p1

    invoke-virtual {p0}, Lhj/r;->j()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1, v1}, Lk2/n;->e(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public i()Landroid/os/Bundle;
    .locals 2

    iget-object v0, p0, Lhj/r;->a:Landroid/os/Bundle;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    iput-object v1, p0, Lhj/r;->a:Landroid/os/Bundle;

    :cond_0
    return-object v0
.end method

.method public final j()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const-string v1, "channel_games"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {}, Lrg/a1;->q0()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "channel_calls"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object v0
.end method

.method public final m(Ljava/lang/String;Landroid/content/Context;Lhj/x;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    if-eqz p4, :cond_1

    invoke-virtual {p3, p2, p4}, Lhj/x;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-object v0

    :cond_0
    return-object p2

    :cond_1
    return-object v0
.end method

.method public n(Landroid/content/Context;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1}, Lhj/r;->q(Landroid/content/Context;)Lhj/s;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lhj/s;->b()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public o(Landroid/content/Context;)Lkj/h0;
    .locals 0

    invoke-virtual {p0, p1}, Lhj/r;->q(Landroid/content/Context;)Lhj/s;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lhj/s;->a()Lkj/h0;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p1, Lkj/h0;->a:Lkj/h0;

    return-object p1
.end method

.method public p(Landroid/content/Context;Ljava/lang/String;Lhj/x;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0, p2, p1, p3, p4}, Lhj/r;->m(Ljava/lang/String;Landroid/content/Context;Lhj/x;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, p2, p3, p4}, Lhj/r;->H(Landroid/content/Context;Ljava/lang/String;Lhj/x;Ljava/lang/String;)V

    return-object v0
.end method

.method public final q(Landroid/content/Context;)Lhj/s;
    .locals 1

    invoke-static {}, Lhj/t;->g()Lhj/t;

    move-result-object v0

    invoke-virtual {v0, p1}, Lhj/t;->h(Landroid/content/Context;)Lhj/s;

    move-result-object p1

    return-object p1
.end method

.method public r(Landroid/content/Context;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1}, Lhj/r;->q(Landroid/content/Context;)Lhj/s;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lhj/s;->c()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public s(Landroid/content/Context;)V
    .locals 7

    new-instance v4, Lhj/x;

    invoke-direct {v4}, Lhj/x;-><init>()V

    invoke-static {p1}, Lk2/n;->f(Landroid/content/Context;)Lk2/n;

    move-result-object v0

    invoke-virtual {v0}, Lk2/n;->a()Z

    move-result v2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AndroidNotifState: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.push"

    invoke-static {v1, v0}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "AndroidNotifStatePrefKey"

    invoke-virtual {v4, p1, v0}, Lhj/x;->e(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v4, p1, v0}, Lhj/x;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v3

    if-eq v2, v3, :cond_0

    goto :goto_0

    :cond_0
    move-object v1, p1

    goto :goto_1

    :cond_1
    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Different value. Reporting new state: "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v4, p1, v0, v2}, Lhj/x;->f(Landroid/content/Context;Ljava/lang/String;Z)V

    const-string v0, "osSettings"

    invoke-static {v0, v2}, Lrg/t0;->l(Ljava/lang/String;Z)V

    new-instance v3, Ljj/a;

    invoke-direct {v3}, Ljj/a;-><init>()V

    iget-object v5, p0, Lhj/r;->b:Lhj/r$d;

    new-instance v6, Lhj/q;

    invoke-direct {v6, p1}, Lhj/q;-><init>(Landroid/content/Context;)V

    move-object v0, p0

    move-object v1, p1

    invoke-virtual/range {v0 .. v6}, Lhj/r;->B(Landroid/content/Context;ZLjj/a;Lhj/x;Lhj/r$d;Lhj/r$c;)V

    :goto_1
    invoke-static {v1}, Lhj/r;->E(Landroid/content/Context;)V

    return-void
.end method

.method public t(Landroid/os/Bundle;)Z
    .locals 7
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "EXTRA_NOTIFICATION_TYPE"

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "EXTRA_NOTIFICATION_VERSION"

    invoke-virtual {p1, v2, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "EXTRA_NOTIFICATION_ID"

    invoke-virtual {p1, v3, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    const/4 v5, 0x0

    if-nez v4, :cond_1

    const-string v4, "rbx.push"

    const-string v6, "... Will handle this Push bundle using Linking protocol."

    invoke-static {v4, v6}, Lek/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    const-string v4, "EXTRA_NOTIFICATION_LINK_ON_INTERACTION"

    invoke-virtual {p1, v4, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v1

    invoke-interface {v1}, Lrh/i;->d1()Z

    move-result v1

    const-string v4, "android_push_notification"

    if-eqz v1, :cond_0

    invoke-static {}, Lim/f;->F()Lim/f;

    move-result-object v1

    invoke-virtual {v1, p1, v4, v5}, Lim/f;->h(Ljava/lang/String;Ljava/lang/String;Z)Lorg/json/JSONObject;

    goto :goto_0

    :cond_0
    invoke-static {}, Lim/f;->F()Lim/f;

    move-result-object v1

    invoke-virtual {v1, p1, v4, v5}, Lim/f;->f(Ljava/lang/String;Ljava/lang/String;Z)V

    :goto_0
    invoke-static {}, Lim/f;->F()Lim/f;

    move-result-object v1

    invoke-virtual {v1, p1}, Lim/f;->k(Ljava/lang/String;)V

    invoke-static {v0, v3, v2, p1}, Lrg/t0;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1

    :cond_1
    return v5
.end method

.method public u()Z
    .locals 1

    iget-object v0, p0, Lhj/r;->a:Landroid/os/Bundle;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final v(Landroid/content/Context;)V
    .locals 6

    const-string v0, "notification"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {}, Lnj/c;->b()Lpt/a;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnj/c;

    new-instance v3, Landroid/app/NotificationChannelGroup;

    invoke-virtual {v2}, Lnj/c;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v2}, Lnj/c;->c()I

    move-result v2

    invoke-virtual {v5, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v4, v2}, Landroid/app/NotificationChannelGroup;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;)V

    invoke-virtual {v0, v3}, Landroid/app/NotificationManager;->createNotificationChannelGroup(Landroid/app/NotificationChannelGroup;)V

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public final w(Landroid/content/Context;)V
    .locals 6

    invoke-static {p1}, Lk2/n;->f(Landroid/content/Context;)Lk2/n;

    move-result-object v0

    invoke-static {}, Lnj/a;->b()Lpt/a;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnj/a;

    invoke-virtual {v2}, Lnj/a;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lk2/n;->h(Ljava/lang/String;)Landroid/app/NotificationChannel;

    move-result-object v3

    if-nez v3, :cond_0

    new-instance v3, Landroid/app/NotificationChannel;

    invoke-virtual {v2}, Lnj/a;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Lnj/a;->d()I

    move-result v5

    invoke-virtual {p1, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Lnj/a;->c()I

    move-result v2

    invoke-direct {v3, v4, v5, v2}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    invoke-virtual {v0, v3}, Lk2/n;->c(Landroid/app/NotificationChannel;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public x(Landroid/content/Context;)V
    .locals 5

    invoke-static {}, Lrh/h;->a()Lrh/i;

    move-result-object v0

    invoke-interface {v0}, Lrh/i;->t0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lhj/r;->v(Landroid/content/Context;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lhj/r;->w(Landroid/content/Context;)V

    :goto_0
    invoke-static {p1}, Lk2/n;->f(Landroid/content/Context;)Lk2/n;

    move-result-object v0

    invoke-virtual {v0}, Lk2/n;->k()Ljava/util/List;

    move-result-object v1

    invoke-static {}, Lnj/b;->c()Lpt/a;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lnj/b;

    invoke-virtual {v3}, Lnj/b;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lmj/b;->g(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v3}, Lnj/b;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lk2/n;->e(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lnj/b;->q()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {p1, v3}, Lhj/r;->f(Landroid/content/Context;Lnj/b;)V

    goto :goto_1

    :cond_2
    invoke-virtual {p0, p1, v3}, Lhj/r;->g(Landroid/content/Context;Lnj/b;)V

    goto :goto_1

    :cond_3
    invoke-virtual {p0, p1}, Lhj/r;->h(Landroid/content/Context;)V

    return-void
.end method

.method public y(Landroid/content/Context;Lkj/i0;)V
    .locals 9

    const-string v0, "rbx.push"

    invoke-virtual {p2}, Lkj/i0;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lek/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lhj/x;

    invoke-direct {v0}, Lhj/x;-><init>()V

    invoke-virtual {p0, p1}, Lhj/r;->q(Landroid/content/Context;)Lhj/s;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lhj/s;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lkj/i0;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p2}, Lkj/i0;->b()Z

    move-result v6

    invoke-virtual {p0, p1, v4, v0, v1}, Lhj/r;->p(Landroid/content/Context;Ljava/lang/String;Lhj/x;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-instance v7, Ljj/a;

    invoke-direct {v7}, Ljj/a;-><init>()V

    iget-object v8, p0, Lhj/r;->b:Lhj/r$d;

    move-object v2, p0

    move-object v3, p1

    invoke-virtual/range {v2 .. v8}, Lhj/r;->F(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLjj/a;Lhj/r$d;)V

    :cond_0
    return-void
.end method

.method public z(Landroid/content/Context;Z)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Lhj/r;->q(Landroid/content/Context;)Lhj/s;

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0}, Lhj/r;->A(Landroid/content/Context;ZLhj/s;)V

    :cond_0
    return-void
.end method
