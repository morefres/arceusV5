.class public Lsm/s$a;
.super Lwu/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsm/s;->W()Lwu/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lwu/e;

.field public final synthetic b:Lsm/s;


# direct methods
.method public constructor <init>(Lsm/s;Lwu/p0;Lwu/e;)V
    .locals 0

    iput-object p1, p0, Lsm/s$a;->b:Lsm/s;

    iput-object p3, p0, Lsm/s$a;->a:Lwu/e;

    invoke-direct {p0, p2}, Lwu/o;-><init>(Lwu/p0;)V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 4

    iget-object v0, p0, Lsm/s$a;->b:Lsm/s;

    invoke-virtual {v0}, Lsm/t;->r()I

    move-result v0

    const/16 v1, 0x9

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lsm/s$a;->b:Lsm/s;

    iget-object v1, v0, Lsm/s;->j:[Ljava/lang/Object;

    iget v2, v0, Lsm/t;->a:I

    aget-object v1, v1, v2

    if-nez v1, :cond_0

    const/4 v1, 0x1

    sub-int/2addr v2, v1

    iput v2, v0, Lsm/t;->a:I

    iget-object v0, p0, Lsm/s$a;->a:Lwu/e;

    invoke-static {v0}, Lsm/m;->s(Lwu/g;)Lsm/m;

    move-result-object v0

    invoke-virtual {v0}, Lsm/m;->B()Ljava/lang/Object;

    move-result-object v0

    iget-object v2, p0, Lsm/s$a;->b:Lsm/s;

    iget-boolean v3, v2, Lsm/t;->g:Z

    iput-boolean v1, v2, Lsm/t;->g:Z

    :try_start_0
    invoke-static {v2, v0}, Lsm/s;->X(Lsm/s;Ljava/lang/Object;)Lsm/s;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lsm/s$a;->b:Lsm/s;

    iput-boolean v3, v0, Lsm/t;->g:Z

    iget-object v2, v0, Lsm/t;->d:[I

    iget v0, v0, Lsm/t;->a:I

    sub-int/2addr v0, v1

    aget v3, v2, v0

    add-int/2addr v3, v1

    aput v3, v2, v0

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lsm/s$a;->b:Lsm/s;

    iput-boolean v3, v1, Lsm/t;->g:Z

    throw v0

    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method
