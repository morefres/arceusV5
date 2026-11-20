.class public final Ldt/g$b;
.super Ldt/a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldt/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ldt/a$a<",
        "TK;TV;TV;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Ldt/a$a;-><init>(I)V

    return-void
.end method

.method public synthetic constructor <init>(ILdt/g$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ldt/g$b;-><init>(I)V

    return-void
.end method


# virtual methods
.method public b()Ldt/g;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ldt/g<",
            "TK;TV;>;"
        }
    .end annotation

    new-instance v0, Ldt/g;

    iget-object v1, p0, Ldt/a$a;->a:Ljava/util/LinkedHashMap;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ldt/g;-><init>(Ljava/util/Map;Ldt/g$a;)V

    return-object v0
.end method

.method public c(Ljava/lang/Object;Ldt/i;)Ldt/g$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Ldt/i<",
            "TV;>;)",
            "Ldt/g$b<",
            "TK;TV;>;"
        }
    .end annotation

    invoke-super {p0, p1, p2}, Ldt/a$a;->a(Ljava/lang/Object;Ldt/i;)Ldt/a$a;

    return-object p0
.end method
