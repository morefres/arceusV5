.class public Lki/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/e0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lki/c;->n(Landroidx/lifecycle/s;Lki/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/lifecycle/e0<",
        "Landroid/graphics/Rect;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lki/c;


# direct methods
.method public constructor <init>(Lki/c;)V
    .locals 0

    iput-object p1, p0, Lki/c$a;->a:Lki/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Landroid/graphics/Rect;

    invoke-virtual {p0, p1}, Lki/c$a;->b(Landroid/graphics/Rect;)V

    return-void
.end method

.method public b(Landroid/graphics/Rect;)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lki/c$a;->a:Lki/c;

    invoke-static {v0, p1}, Lki/c;->b(Lki/c;Landroid/graphics/Rect;)V

    iget-object p1, p0, Lki/c$a;->a:Lki/c;

    invoke-static {p1}, Lki/c;->c(Lki/c;)V

    :cond_0
    return-void
.end method
