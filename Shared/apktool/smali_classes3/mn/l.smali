.class public Lmn/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqn/g;


# instance fields
.field public final a:Lon/s;

.field public final b:Lqn/h;


# direct methods
.method public constructor <init>(Lon/s;Lqn/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmn/l;->a:Lon/s;

    iput-object p2, p0, Lmn/l;->b:Lqn/h;

    return-void
.end method


# virtual methods
.method public c()Lon/s;
    .locals 1

    iget-object v0, p0, Lmn/l;->a:Lon/s;

    return-object v0
.end method

.method public d()Lqn/h;
    .locals 1

    iget-object v0, p0, Lmn/l;->b:Lqn/h;

    return-object v0
.end method
