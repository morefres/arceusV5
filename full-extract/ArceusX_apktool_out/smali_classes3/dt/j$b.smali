.class public final Ldt/j$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldt/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ldt/i<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ldt/i<",
            "Ljava/util/Collection<",
            "TT;>;>;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(II)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Ldt/b;->d(I)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ldt/j$b;->a:Ljava/util/List;

    .line 4
    invoke-static {p2}, Ldt/b;->d(I)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ldt/j$b;->b:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(IILdt/j$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ldt/j$b;-><init>(II)V

    return-void
.end method


# virtual methods
.method public a(Ldt/i;)Ldt/j$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "+",
            "Ljava/util/Collection<",
            "+TT;>;>;)",
            "Ldt/j$b<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Ldt/j$b;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public b(Ldt/i;)Ldt/j$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "+TT;>;)",
            "Ldt/j$b<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Ldt/j$b;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public c()Ldt/j;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ldt/j<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Ldt/j;

    iget-object v1, p0, Ldt/j$b;->a:Ljava/util/List;

    iget-object v2, p0, Ldt/j$b;->b:Ljava/util/List;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Ldt/j;-><init>(Ljava/util/List;Ljava/util/List;Ldt/j$a;)V

    return-object v0
.end method
