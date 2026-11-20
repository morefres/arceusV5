.class public final synthetic Lpo/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Ltr/f;


# direct methods
.method public synthetic constructor <init>(Ltr/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpo/f0;->a:Ltr/f;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpo/f0;->a:Ltr/f;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;

    invoke-static {v0, p1}, Lpo/m0;->d(Ltr/f;Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
