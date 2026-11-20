.class public Lln/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lon/b0;

.field public final b:Lqn/h;

.field public final c:Lon/b0;

.field public final d:Lqn/h;

.field public final e:Lqn/h;

.field public final f:Lln/e;

.field public final g:Lln/g;

.field public h:Z

.field public i:Z


# direct methods
.method public constructor <init>(Lon/b0;Lqn/h;Lon/b0;Lqn/h;Lqn/h;Lln/e;Lln/g;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lln/e;->h:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lln/e;->i:Z

    iput-object p1, p0, Lln/e;->a:Lon/b0;

    iput-object p2, p0, Lln/e;->b:Lqn/h;

    iput-object p3, p0, Lln/e;->c:Lon/b0;

    iput-object p4, p0, Lln/e;->d:Lqn/h;

    iput-object p5, p0, Lln/e;->e:Lqn/h;

    iput-object p6, p0, Lln/e;->f:Lln/e;

    iput-object p7, p0, Lln/e;->g:Lln/g;

    return-void
.end method

.method public static a(Lon/b0;Lqn/h;Lqn/h;Lln/e;Lln/g;)Lln/e;
    .locals 8

    new-instance v0, Lln/e;

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object v7, p4

    invoke-direct/range {v0 .. v7}, Lln/e;-><init>(Lon/b0;Lqn/h;Lon/b0;Lqn/h;Lqn/h;Lln/e;Lln/g;)V

    return-object v0
.end method

.method public static b(Lon/b0;Lqn/h;Lon/b0;Lqn/h;Lqn/h;Lln/e;Lln/g;)Lln/e;
    .locals 8

    new-instance v0, Lln/e;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lln/e;-><init>(Lon/b0;Lqn/h;Lon/b0;Lqn/h;Lqn/h;Lln/e;Lln/g;)V

    return-object v0
.end method
