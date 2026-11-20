.class public final synthetic Ldq/e1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Ldq/k2;

.field public final synthetic b:Ltr/f;


# direct methods
.method public synthetic constructor <init>(Ldq/k2;Ltr/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldq/e1;->a:Ldq/k2;

    iput-object p2, p0, Ldq/e1;->b:Ltr/f;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ldq/e1;->a:Ldq/k2;

    iget-object v1, p0, Ldq/e1;->b:Ltr/f;

    invoke-static {v0, v1}, Ldq/k2;->I0(Ldq/k2;Ltr/f;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
