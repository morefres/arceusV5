.class public Lmn/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqn/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmn/k$a;
    }
.end annotation


# instance fields
.field public final a:Lmn/k$a;

.field public final b:Lon/s;

.field public final c:Lqn/h;

.field public d:Z


# direct methods
.method public constructor <init>(Lmn/k$a;Lon/s;Lqn/h;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lmn/k;->d:Z

    iput-object p1, p0, Lmn/k;->a:Lmn/k$a;

    iput-object p2, p0, Lmn/k;->b:Lon/s;

    iput-object p3, p0, Lmn/k;->c:Lqn/h;

    return-void
.end method


# virtual methods
.method public c()Lqn/f;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lmn/k;->d:Z

    return-object p0
.end method

.method public d()Lon/s;
    .locals 1

    iget-object v0, p0, Lmn/k;->b:Lon/s;

    return-object v0
.end method

.method public e()Lqn/h;
    .locals 1

    iget-object v0, p0, Lmn/k;->c:Lqn/h;

    return-object v0
.end method

.method public f()Lmn/k$a;
    .locals 1

    iget-object v0, p0, Lmn/k;->a:Lmn/k$a;

    return-object v0
.end method

.method public g()Z
    .locals 1

    iget-boolean v0, p0, Lmn/k;->d:Z

    return v0
.end method
