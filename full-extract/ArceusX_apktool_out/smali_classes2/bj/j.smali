.class public Lbj/j;
.super Lbj/a;
.source "SourceFile"


# instance fields
.field public a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Lbj/a;-><init>()V

    iput-object p1, p0, Lbj/j;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public a(Landroid/net/Uri;)Landroid/database/Cursor;
    .locals 1

    const-string v0, "user_agent_param"

    invoke-virtual {p1, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lbj/j;->a:Landroid/content/Context;

    invoke-static {v0}, Lrg/a1;->S0(Landroid/content/Context;)V

    if-nez p1, :cond_0

    const-string p1, "google"

    :cond_0
    iget-object v0, p0, Lbj/j;->a:Landroid/content/Context;

    invoke-static {v0, p1}, Lrg/a1;->n(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lbj/j$a;

    invoke-direct {v0, p0, p1}, Lbj/j$a;-><init>(Lbj/j;Ljava/lang/String;)V

    return-object v0
.end method

.method public b(Lbj/i$a;)Lfh/a;
    .locals 1

    sget-object v0, Lbj/i$a;->a:Lbj/i$a;

    if-ne p1, v0, :cond_0

    sget-object p1, Lfh/a;->f:Lfh/a;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
