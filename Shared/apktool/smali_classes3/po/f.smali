.class public final synthetic Lpo/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Ltr/f;


# direct methods
.method public synthetic constructor <init>(Ltr/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpo/f;->a:Ltr/f;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpo/f;->a:Ltr/f;

    invoke-static {v0}, Lpo/i;->f(Ltr/f;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
