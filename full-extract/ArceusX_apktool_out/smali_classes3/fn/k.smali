.class public final synthetic Lfn/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/ImageReader$OnImageAvailableListener;


# instance fields
.field public final synthetic a:Lfn/s;


# direct methods
.method public synthetic constructor <init>(Lfn/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfn/k;->a:Lfn/s;

    return-void
.end method


# virtual methods
.method public final onImageAvailable(Landroid/media/ImageReader;)V
    .locals 1

    iget-object v0, p0, Lfn/k;->a:Lfn/s;

    invoke-static {v0, p1}, Lfn/s;->i(Lfn/s;Landroid/media/ImageReader;)V

    return-void
.end method
