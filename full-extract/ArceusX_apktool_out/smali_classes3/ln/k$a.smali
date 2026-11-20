.class public Lln/k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrn/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lln/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Lrn/d;


# direct methods
.method public constructor <init>(Lrn/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lln/k$a;->a:Lrn/d;

    return-void
.end method


# virtual methods
.method public a()Lrn/d;
    .locals 1

    iget-object v0, p0, Lln/k$a;->a:Lrn/d;

    return-object v0
.end method

.method public b()Lpn/j;
    .locals 2

    iget-object v0, p0, Lln/k$a;->a:Lrn/d;

    instance-of v1, v0, Lln/z;

    if-eqz v1, :cond_0

    check-cast v0, Lln/z;

    invoke-virtual {v0}, Lln/z;->k()Lpn/j;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-static {}, Lpn/j;->b()Lpn/j;

    move-result-object v0

    return-object v0
.end method
