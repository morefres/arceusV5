.class public Lhj/u;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhj/u$b;,
        Lhj/u$a;
    }
.end annotation


# instance fields
.field public a:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lhj/j;",
            ">;"
        }
    .end annotation
.end field

.field public b:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lhj/u;->a:Ljava/util/HashMap;

    .line 4
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lhj/u;->b:Ljava/util/HashMap;

    .line 5
    invoke-virtual {p0}, Lhj/u;->g()V

    return-void
.end method

.method public synthetic constructor <init>(Lhj/v;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lhj/u;-><init>()V

    return-void
.end method

.method public static c()Lhj/u;
    .locals 1

    invoke-static {}, Lhj/u$b;->a()Lhj/u;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lhj/u;->b:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    iget-object v0, p0, Lhj/u;->a:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    invoke-virtual {p0}, Lhj/u;->g()V

    return-void
.end method

.method public b(Ljava/lang/String;)Lhj/j;
    .locals 1

    iget-object v0, p0, Lhj/u;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lhj/j;

    return-object p1
.end method

.method public d(Ljava/lang/String;)Lhj/j;
    .locals 2

    iget-object v0, p0, Lhj/u;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lhj/u;->a:Ljava/util/HashMap;

    new-instance v1, Lhj/u$a;

    invoke-direct {v1, p0, p1}, Lhj/u$a;-><init>(Lhj/u;Ljava/lang/String;)V

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object v0, p0, Lhj/u;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lhj/j;

    return-object p1
.end method

.method public e(Ljava/lang/String;J)Lhj/j;
    .locals 2

    iget-object v0, p0, Lhj/u;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lhj/u;->a:Ljava/util/HashMap;

    new-instance v1, Lhj/c;

    invoke-direct {v1, p2, p3}, Lhj/c;-><init>(J)V

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object p2, p0, Lhj/u;->a:Ljava/util/HashMap;

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lhj/j;

    return-object p1
.end method

.method public f(J)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lhj/u;->b:Ljava/util/HashMap;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public g()V
    .locals 3

    iget-object v0, p0, Lhj/u;->a:Ljava/util/HashMap;

    new-instance v1, Lhj/g;

    invoke-direct {v1}, Lhj/g;-><init>()V

    const-string v2, "FriendRequestReceived"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lhj/u;->a:Ljava/util/HashMap;

    new-instance v1, Lhj/f;

    invoke-direct {v1}, Lhj/f;-><init>()V

    const-string v2, "FriendRequestAccepted"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lhj/u;->a:Ljava/util/HashMap;

    new-instance v1, Lhj/l;

    invoke-direct {v1}, Lhj/l;-><init>()V

    const-string v2, "PrivateMessageReceived"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public h(JLjava/lang/String;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lhj/u;->b:Ljava/util/HashMap;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v0, p1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public i(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lhj/u;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
