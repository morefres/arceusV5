.class public final Lcp/e$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcp/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lcp/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcp/e;

    invoke-direct {v0}, Lcp/e;-><init>()V

    sput-object v0, Lcp/e$a;->a:Lcp/e;

    return-void
.end method
