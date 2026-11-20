.class public Lon/t$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lon/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable<",
        "Lon/s;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lon/s;

.field public final b:Lon/s;


# direct methods
.method public constructor <init>(Lon/s;Lon/s;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lon/t$a;->a:Lon/s;

    .line 4
    iput-object p2, p0, Lon/t$a;->b:Lon/s;

    return-void
.end method

.method public synthetic constructor <init>(Lon/s;Lon/s;Lon/u;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lon/t$a;-><init>(Lon/s;Lon/s;)V

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Lon/s;",
            ">;"
        }
    .end annotation

    new-instance v0, Lon/t$b;

    iget-object v1, p0, Lon/t$a;->a:Lon/s;

    iget-object v2, p0, Lon/t$a;->b:Lon/s;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lon/t$b;-><init>(Lon/s;Lon/s;Lon/u;)V

    return-object v0
.end method
