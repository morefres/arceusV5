.class public Lkk/f$a;
.super Landroid/view/OrientationEventListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkk/f;-><init>(Landroid/app/Activity;Landroid/view/SurfaceView;Lkk/f$f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lkk/f;


# direct methods
.method public constructor <init>(Lkk/f;Landroid/content/Context;I)V
    .locals 0

    iput-object p1, p0, Lkk/f$a;->a:Lkk/f;

    invoke-direct {p0, p2, p3}, Landroid/view/OrientationEventListener;-><init>(Landroid/content/Context;I)V

    return-void
.end method


# virtual methods
.method public onOrientationChanged(I)V
    .locals 0

    iget-object p1, p0, Lkk/f$a;->a:Lkk/f;

    invoke-static {p1}, Lkk/f;->l(Lkk/f;)V

    return-void
.end method
