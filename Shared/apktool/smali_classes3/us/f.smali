.class public Lus/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lss/t;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lss/g;Lss/r;)Ljava/lang/Object;
    .locals 3
    .param p1    # Lss/g;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lss/r;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lcom/withpersona/sdk2/markwon/core/spans/LinkSpan;

    invoke-virtual {p1}, Lss/g;->e()Lts/c;

    move-result-object v1

    sget-object v2, Lts/b;->e:Lss/p;

    invoke-virtual {v2, p2}, Lss/p;->c(Lss/r;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p1}, Lss/g;->b()Lss/c;

    move-result-object p1

    invoke-direct {v0, v1, p2, p1}, Lcom/withpersona/sdk2/markwon/core/spans/LinkSpan;-><init>(Lts/c;Ljava/lang/String;Lss/c;)V

    return-object v0
.end method
