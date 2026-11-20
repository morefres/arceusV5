.class public final Lfn/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfn/b0$a;


# instance fields
.field public final a:Lfn/c0;


# direct methods
.method public constructor <init>(Lfn/c0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfn/d0;->a:Lfn/c0;

    return-void
.end method

.method public static b(Lfn/c0;)Ldt/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfn/c0;",
            ")",
            "Ldt/i<",
            "Lfn/b0$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lfn/d0;

    invoke-direct {v0, p0}, Lfn/d0;-><init>(Lfn/c0;)V

    invoke-static {v0}, Ldt/e;->a(Ljava/lang/Object;)Ldt/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lfn/k0;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Lfn/g;Lkn/a;Lsr/a;Z)Lfn/b0;
    .locals 7
    .param p5    # Lsr/a;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iget-object v0, p0, Lfn/d0;->a:Lfn/c0;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move v6, p6

    invoke-virtual/range {v0 .. v6}, Lfn/c0;->b(Lfn/k0;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Lfn/g;Lkn/a;Lsr/a;Z)Lfn/b0;

    move-result-object p1

    return-object p1
.end method
