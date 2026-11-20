.class public Lss/o$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lss/m$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lss/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Lon/s;",
            ">;",
            "Lss/m$c<",
            "+",
            "Lon/s;",
            ">;>;"
        }
    .end annotation
.end field

.field public b:Lss/m$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lss/o$a;->a:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public a(Lss/g;Lss/r;)Lss/m;
    .locals 7
    .param p1    # Lss/g;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lss/r;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lss/o$a;->b:Lss/m$a;

    if-nez v0, :cond_0

    new-instance v0, Lss/b;

    invoke-direct {v0}, Lss/b;-><init>()V

    :cond_0
    move-object v6, v0

    new-instance v1, Lss/o;

    new-instance v4, Lss/u;

    invoke-direct {v4}, Lss/u;-><init>()V

    iget-object v0, p0, Lss/o$a;->a:Ljava/util/Map;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v5

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lss/o;-><init>(Lss/g;Lss/r;Lss/u;Ljava/util/Map;Lss/m$a;)V

    return-object v1
.end method

.method public b(Ljava/lang/Class;Lss/m$c;)Lss/m$b;
    .locals 1
    .param p1    # Ljava/lang/Class;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<N:",
            "Lon/s;",
            ">(",
            "Ljava/lang/Class<",
            "TN;>;",
            "Lss/m$c<",
            "-TN;>;)",
            "Lss/m$b;"
        }
    .end annotation

    if-nez p2, :cond_0

    iget-object p2, p0, Lss/o$a;->a:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0

    :cond_0
    iget-object v0, p0, Lss/o$a;->a:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method
