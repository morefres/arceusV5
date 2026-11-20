.class public Lmm/l;
.super Lmm/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmm/l$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lmm/k;-><init>()V

    return-void
.end method

.method public static f0()Lmm/l;
    .locals 1

    invoke-static {}, Lmm/l$a;->a()Lmm/l;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public s(Lmm/n;)Ljava/lang/String;
    .locals 0

    const-string p1, ""

    return-object p1
.end method
