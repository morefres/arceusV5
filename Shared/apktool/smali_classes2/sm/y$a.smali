.class public Lsm/y$a;
.super Lsm/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsm/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lsm/h<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lsm/h;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lsm/m;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p1}, Lsm/m;->r()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public b(Lsm/t;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p1, p2}, Lsm/t;->M(Ljava/lang/String;)Lsm/t;

    return-void
.end method

.method public bridge synthetic fromJson(Lsm/m;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lsm/y$a;->a(Lsm/m;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic toJson(Lsm/t;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lsm/y$a;->b(Lsm/t;Ljava/lang/String;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "JsonAdapter(String)"

    return-object v0
.end method
