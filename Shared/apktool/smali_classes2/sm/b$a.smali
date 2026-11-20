.class public Lsm/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsm/h$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsm/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public create(Ljava/lang/reflect/Type;Ljava/util/Set;Lsm/w;)Lsm/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "Ljava/util/Set<",
            "+",
            "Ljava/lang/annotation/Annotation;",
            ">;",
            "Lsm/w;",
            ")",
            "Lsm/h<",
            "*>;"
        }
    .end annotation

    invoke-static {p1}, Lsm/a0;->a(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    invoke-interface {p2}, Ljava/util/Set;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_1

    return-object v0

    :cond_1
    invoke-static {p1}, Lsm/a0;->g(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p3, p1}, Lsm/w;->d(Ljava/lang/reflect/Type;)Lsm/h;

    move-result-object p1

    new-instance p3, Lsm/b;

    invoke-direct {p3, p2, p1}, Lsm/b;-><init>(Ljava/lang/Class;Lsm/h;)V

    invoke-virtual {p3}, Lsm/h;->nullSafe()Lsm/h;

    move-result-object p1

    return-object p1
.end method
