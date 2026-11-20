.class public final synthetic Lkk/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;


# instance fields
.field public final synthetic a:Lkk/f;

.field public final synthetic b:Landroid/view/SurfaceView;


# direct methods
.method public synthetic constructor <init>(Lkk/f;Landroid/view/SurfaceView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkk/e;->a:Lkk/f;

    iput-object p2, p0, Lkk/e;->b:Landroid/view/SurfaceView;

    return-void
.end method


# virtual methods
.method public final onWindowFocusChanged(Z)V
    .locals 2

    iget-object v0, p0, Lkk/e;->a:Lkk/f;

    iget-object v1, p0, Lkk/e;->b:Landroid/view/SurfaceView;

    invoke-static {v0, v1, p1}, Lkk/f;->c(Lkk/f;Landroid/view/SurfaceView;Z)V

    return-void
.end method
