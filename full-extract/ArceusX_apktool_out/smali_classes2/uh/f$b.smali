.class public Luh/f$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luh/f$h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Luh/f;->p(Luh/f$h;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Luh/f$h;

.field public final synthetic b:Luh/f;


# direct methods
.method public constructor <init>(Luh/f;Luh/f$h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Luh/f$b;->b:Luh/f;

    iput-object p2, p0, Luh/f$b;->a:Luh/f$h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 2

    if-nez p1, :cond_0

    iget-object v0, p0, Luh/f$b;->b:Luh/f;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Luh/f;->e(Luh/f;Z)V

    :cond_0
    iget-object v0, p0, Luh/f$b;->a:Luh/f$h;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Luh/f$h;->a(I)V

    :cond_1
    return-void
.end method
