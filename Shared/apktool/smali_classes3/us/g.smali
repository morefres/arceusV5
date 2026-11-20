.class public Lus/g;
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
    .locals 2
    .param p1    # Lss/g;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lss/r;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    sget-object v0, Lts/b$a;->a:Lts/b$a;

    sget-object v1, Lts/b;->a:Lss/p;

    invoke-virtual {v1, p2}, Lss/p;->c(Lss/r;)Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_0

    new-instance v0, Lvs/b;

    invoke-virtual {p1}, Lss/g;->e()Lts/c;

    move-result-object p1

    sget-object v1, Lts/b;->b:Lss/p;

    invoke-virtual {v1, p2}, Lss/p;->c(Lss/r;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-direct {v0, p1, p2}, Lvs/b;-><init>(Lts/c;I)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lts/b;->c:Lss/p;

    invoke-virtual {v1, p2}, Lss/p;->c(Lss/r;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "."

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p2, 0xa0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Lvs/h;

    invoke-virtual {p1}, Lss/g;->e()Lts/c;

    move-result-object p1

    invoke-direct {v0, p1, p2}, Lvs/h;-><init>(Lts/c;Ljava/lang/String;)V

    return-object v0
.end method
