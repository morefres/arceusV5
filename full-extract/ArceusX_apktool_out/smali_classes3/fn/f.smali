.class public final Lfn/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfn/c$a;


# instance fields
.field public final a:Lfn/e;


# direct methods
.method public constructor <init>(Lfn/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfn/f;->a:Lfn/e;

    return-void
.end method

.method public static b(Lfn/e;)Ldt/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfn/e;",
            ")",
            "Ldt/i<",
            "Lfn/c$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lfn/f;

    invoke-direct {v0, p0}, Lfn/f;-><init>(Lfn/e;)V

    invoke-static {v0}, Ldt/e;->a(Ljava/lang/Object;)Ldt/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lfn/k0;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Lfn/g;Lkn/a;Lsr/a;Z)Lfn/c;
    .locals 7
    .param p5    # Lsr/a;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iget-object v0, p0, Lfn/f;->a:Lfn/e;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move v6, p6

    invoke-virtual/range {v0 .. v6}, Lfn/e;->b(Lfn/k0;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Lfn/g;Lkn/a;Lsr/a;Z)Lfn/c;

    move-result-object p1

    return-object p1
.end method
