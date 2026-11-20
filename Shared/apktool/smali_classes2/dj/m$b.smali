.class public Ldj/m$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldj/m;->o1(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ldj/m;


# direct methods
.method public constructor <init>(Ldj/m;)V
    .locals 0

    iput-object p1, p0, Ldj/m$b;->a:Ldj/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/android/billingclient/api/d;Ljava/util/List;)V
    .locals 1
    .param p1    # Lcom/android/billingclient/api/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/billingclient/api/d;",
            "Ljava/util/List<",
            "Lv7/k;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Ldj/m$b;->a:Ldj/m;

    invoke-static {v0, p1, p2}, Ldj/m;->U(Ldj/m;Lcom/android/billingclient/api/d;Ljava/util/List;)V

    return-void
.end method
