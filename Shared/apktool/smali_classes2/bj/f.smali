.class public Lbj/f;
.super Lbj/a;
.source "SourceFile"


# instance fields
.field public a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Lbj/a;-><init>()V

    iput-object p1, p0, Lbj/f;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public a(Landroid/net/Uri;)Landroid/database/Cursor;
    .locals 1

    iget-object p1, p0, Lbj/f;->a:Landroid/content/Context;

    invoke-static {p1}, Lrg/t;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lbj/f$a;

    invoke-direct {v0, p0, p1}, Lbj/f$a;-><init>(Lbj/f;Ljava/lang/String;)V

    return-object v0
.end method

.method public b(Lbj/i$a;)Lfh/a;
    .locals 1

    sget-object v0, Lbj/i$a;->a:Lbj/i$a;

    if-ne p1, v0, :cond_0

    sget-object p1, Lfh/a;->g:Lfh/a;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
