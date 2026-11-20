.class public final Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo_PermissionErrorInfoJsonAdapter;
.super Lsm/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lsm/h<",
        "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$PermissionErrorInfo;",
        ">;"
    }
.end annotation


# instance fields
.field private final options:Lsm/m$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final stringAdapter:Lsm/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsm/h<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lsm/w;)V
    .locals 3
    .param p1    # Lsm/w;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-direct {p0}, Lsm/h;-><init>()V

    const-string v0, "message"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lsm/m$b;->a([Ljava/lang/String;)Lsm/m$b;

    move-result-object v1

    iput-object v1, p0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo_PermissionErrorInfoJsonAdapter;->options:Lsm/m$b;

    invoke-static {}, Lkotlin/collections/q0;->d()Ljava/util/Set;

    move-result-object v1

    const-class v2, Ljava/lang/String;

    invoke-virtual {p1, v2, v1, v0}, Lsm/w;->f(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lsm/h;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo_PermissionErrorInfoJsonAdapter;->stringAdapter:Lsm/h;

    return-void
.end method


# virtual methods
.method public fromJson(Lsm/m;)Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$PermissionErrorInfo;
    .locals 4
    .param p1    # Lsm/m;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 2
    invoke-virtual {p1}, Lsm/m;->b()V

    const/4 v0, 0x0

    .line 3
    :goto_0
    invoke-virtual {p1}, Lsm/m;->f()Z

    move-result v1

    const-string v2, "message"

    if-eqz v1, :cond_3

    .line 4
    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo_PermissionErrorInfoJsonAdapter;->options:Lsm/m$b;

    invoke-virtual {p1, v1}, Lsm/m;->F(Lsm/m$b;)I

    move-result v1

    const/4 v3, -0x1

    if-eq v1, v3, :cond_2

    if-eqz v1, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo_PermissionErrorInfoJsonAdapter;->stringAdapter:Lsm/h;

    invoke-virtual {v0, p1}, Lsm/h;->fromJson(Lsm/m;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_1

    goto :goto_0

    .line 6
    :cond_1
    invoke-static {v2, v2, p1}, Lum/c;->x(Ljava/lang/String;Ljava/lang/String;Lsm/m;)Lsm/j;

    move-result-object p1

    throw p1

    .line 7
    :cond_2
    invoke-virtual {p1}, Lsm/m;->M()V

    .line 8
    invoke-virtual {p1}, Lsm/m;->P()V

    goto :goto_0

    .line 9
    :cond_3
    invoke-virtual {p1}, Lsm/m;->d()V

    .line 10
    new-instance v1, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$PermissionErrorInfo;

    if-eqz v0, :cond_4

    .line 11
    invoke-direct {v1, v0}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$PermissionErrorInfo;-><init>(Ljava/lang/String;)V

    return-object v1

    .line 12
    :cond_4
    invoke-static {v2, v2, p1}, Lum/c;->o(Ljava/lang/String;Ljava/lang/String;Lsm/m;)Lsm/j;

    move-result-object p1

    throw p1
.end method

.method public bridge synthetic fromJson(Lsm/m;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo_PermissionErrorInfoJsonAdapter;->fromJson(Lsm/m;)Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$PermissionErrorInfo;

    move-result-object p1

    return-object p1
.end method

.method public toJson(Lsm/t;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$PermissionErrorInfo;)V
    .locals 1
    .param p1    # Lsm/t;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$PermissionErrorInfo;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p1}, Lsm/t;->c()Lsm/t;

    .line 3
    const-string v0, "message"

    invoke-virtual {p1, v0}, Lsm/t;->n(Ljava/lang/String;)Lsm/t;

    .line 4
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo_PermissionErrorInfoJsonAdapter;->stringAdapter:Lsm/h;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$PermissionErrorInfo;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lsm/h;->toJson(Lsm/t;Ljava/lang/Object;)V

    .line 5
    invoke-virtual {p1}, Lsm/t;->g()Lsm/t;

    return-void

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "value_ was null! Wrap in .nullSafe() to write nullable values."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic toJson(Lsm/t;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$PermissionErrorInfo;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo_PermissionErrorInfoJsonAdapter;->toJson(Lsm/t;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$PermissionErrorInfo;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x3b

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "GeneratedJsonAdapter(InternalErrorInfo.PermissionErrorInfo)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
