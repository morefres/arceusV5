.class public Lbj/g;
.super Lbj/a;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lbj/a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/net/Uri;)Landroid/database/Cursor;
    .locals 0

    new-instance p1, Laj/a;

    invoke-direct {p1}, Laj/a;-><init>()V

    return-object p1
.end method

.method public b(Lbj/i$a;)Lfh/a;
    .locals 1

    sget-object v0, Lbj/i$a;->a:Lbj/i$a;

    if-ne p1, v0, :cond_0

    sget-object p1, Lfh/a;->c:Lfh/a;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
