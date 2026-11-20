.class public final synthetic Lmr/s5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmr/s5;->a:Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lmr/s5;->a:Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;

    check-cast p1, Lwm/r$c;

    invoke-static {v0, p1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;->O(Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;Lwm/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
